package MenuRecommendation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNumberOfRequests = Integer.parseInt(scanner.nextLine());

        MenuRecommendation menuRecommendation = new MenuRecommendation();

        for (int i = 0; i < totalNumberOfRequests; i++) {
            String request = scanner.nextLine();
            String[] parts = request.split(" ");

            switch (parts[0]) {
                case "addItem":
                    menuRecommendation.addItem(Integer.parseInt(parts[1]), parts[2]);
                    break;
                case "getRecommendedItem":
                    MenuItem recommendedItem = menuRecommendation.getRecommendedItem();
                    if (recommendedItem == null) {
                        System.out.println("N/A");
                    } else {
                        System.out.println(recommendedItem);
                    }
                    break;
                case "outOfStockItem":
                    menuRecommendation.outOfStockItem(Integer.parseInt(parts[1]));
                    break;
                case "restockItem":
                    menuRecommendation.restockItem(Integer.parseInt(parts[1]));
                    break;
                case "makeDealOfTheDayItem":
                    menuRecommendation.makeDealOfTheDayItem(Integer.parseInt(parts[1]));
                    break;
                case "rateItem":
                    menuRecommendation.rateItem(Integer.parseInt(parts[1]),
                                                Integer.parseInt(parts[2]));
                    break;
                default:
                    break;
            }
        }

        scanner.close();
    }
}