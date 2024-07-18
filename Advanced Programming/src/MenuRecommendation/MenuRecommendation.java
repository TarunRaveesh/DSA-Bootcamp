package MenuRecommendation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.*;

public class MenuRecommendation implements IMenuRecommendation {
    private final Map<Integer, MenuItem> menuItems;
    private MenuItem dealOfTheDay;

    public MenuRecommendation() {
        this.menuItems = new HashMap<>();
        this.dealOfTheDay = null;
    }

    @Override
    public void addItem(int itemId, String displayName) {
        menuItems.put(itemId, new MenuItem(itemId, displayName));
    }

    @Override
    public MenuItem getRecommendedItem() {
        if (dealOfTheDay != null && dealOfTheDay.isInStock()) {
            return dealOfTheDay;
        }

        List<MenuItem> availableItems = new ArrayList<>();
        for (MenuItem item : menuItems.values()) {
            if (item.isInStock()) {
                availableItems.add(item);
            }
        }

        if (availableItems.isEmpty()) {
            return null;
        }

        Comparator<MenuItem> comparator = Comparator
                .comparing(MenuItem::getAverageRating)
                .thenComparing(MenuItem::getTotalRatings, Comparator.reverseOrder())
                .thenComparing(MenuItem::getDisplayName)
                .thenComparing(MenuItem::getItemId);

        return availableItems.stream().max(comparator).orElse(null);
    }

    @Override
    public void outOfStockItem(int itemId) {
        MenuItem item = menuItems.get(itemId);
        if (item != null) {
            if (item.equals(dealOfTheDay)) {
                dealOfTheDay.setInStock(false);
                dealOfTheDay = null;
            } else {
                item.setInStock(false);
            }
        }
    }

    @Override
    public void restockItem(int itemId) {
        MenuItem item = menuItems.get(itemId);
        if (item != null) {
            item.setInStock(true);
        }
    }

    @Override
    public void makeDealOfTheDayItem(int itemId) {
        MenuItem item = menuItems.get(itemId);
        if (item != null && item.isInStock()) {
            if (dealOfTheDay != null) {
                dealOfTheDay.setDealOfTheDay(false);
            }
            item.setDealOfTheDay(true);
            dealOfTheDay = item;
        }
    }

    @Override
    public void rateItem(int itemId, int rating) {
        MenuItem item = menuItems.get(itemId);
        if (item != null) {
            item.updateRating(rating);
        }
    }
}
