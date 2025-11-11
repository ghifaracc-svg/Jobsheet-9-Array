import java.util.Scanner;

public class CafeMenuSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Predefined menu items (initialized directly in array)
        String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", 
                        "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};

        // Step 2: Display the menu
        System.out.println("=== Welcome to Java Cafe ===");
        System.out.println("Here is our menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        // Step 3: Ask user to enter the item they want to search for
        System.out.print("\nEnter the name of the item you want to search for: ");
        String searchItem = input.nextLine();

        // Step 4: Linear search process
        boolean found = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(searchItem)) { // Case-insensitive comparison
                found = true;
                break;
            }
        }

        // Step 5: Display result
        if (found) {
            System.out.println("✅ The item \"" + searchItem + "\" is available on the menu.");
        } else {
            System.out.println("❌ Sorry, the item \"" + searchItem + "\" is not on the menu.");
        }

        input.close();
    }
}
