/**
 * Manages grocery inventory using parallel arrays.
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
}