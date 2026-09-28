import java.util.Scanner;

/**
 * Manages a grocery inventory using parallel arrays.
 *
 * @author Myles Johnson
 */
public class GroceryManagementSystem {

    /**
     * Displays all non-empty items in the grocery inventory.
     *
     * @param names the names of the grocery items
     * @param prices the prices of the grocery items
     * @param stocks the stock quantities of the grocery items
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println("Item: " + names[i]);
                System.out.println("Price: $" + prices[i]);
                System.out.println("Stock: " + stocks[i]);
                System.out.println();
            } else {
                // This inventory slot is empty.
            }
        }
    }

    /**
     * Adds stock to an existing grocery item.
     *
     * @param names the names of the grocery items
     * @param stocks the stock quantities of the grocery items
     * @param target the name of the item to restock
     * @param amount the amount of stock to add
     */
    public static void restockItem(String[] names, int[] stocks,
                                   String target, int amount) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null && names[i].equalsIgnoreCase(target)) {
                stocks[i] += amount;
                System.out.println("Restocked " + names[i] + ".");
                return;
            }
        }

        System.out.println("Item not found.");
    }

    /**
     * Runs the grocery management system menu.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Apples";
        itemPrices[0] = 2.99;
        itemStocks[0] = 10;

        itemNames[1] = "Milk";
        itemPrices[1] = 3.49;
        itemStocks[1] = 5;

        itemNames[2] = "Bread";
        itemPrices[2] = 2.50;
        itemStocks[2] = 8;

        while (true) {
            System.out.println("Grocery Management System");
            System.out.println("1. View Inventory");
            System.out.println("2. Restock Item");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                printInventory(itemNames, itemPrices, itemStocks);

            } else if (choice == 2) {
                System.out.print("Enter item name: ");
                String target = scanner.nextLine();

                System.out.print("Enter amount to restock: ");
                int amount = scanner.nextInt();
                scanner.nextLine();

                restockItem(itemNames, itemStocks, target, amount);

            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}