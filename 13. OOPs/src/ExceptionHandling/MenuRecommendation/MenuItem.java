package ExceptionHandling.MenuRecommendation;

import java.util.Objects;

public class MenuItem {
    private final int itemId;
    private final String displayName;
    private double averageRating;
    private int totalRatings;
    private boolean inStock;
    private boolean isDealOfTheDay;

    public MenuItem(int itemId, String displayName) {
        this.itemId = itemId;
        this.displayName = displayName;
        this.averageRating = 0.0;
        this.totalRatings = 0;
        this.inStock = true;
        this.isDealOfTheDay = false;
    }

    public int getItemId() {
        return itemId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void updateRating(int rating) {
        double totalRatingPoints = averageRating * totalRatings + rating;
        totalRatings++;
        averageRating = totalRatingPoints / totalRatings;
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public boolean isDealOfTheDay() {
        return isDealOfTheDay;
    }

    public void setDealOfTheDay(boolean dealOfTheDay) {
        isDealOfTheDay = dealOfTheDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return itemId == menuItem.itemId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }

    @Override
    public String toString() {
        return itemId + " " + displayName + " Rating: " + averageRating;
    }
}

