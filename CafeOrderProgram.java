import java.util.Scanner; // Import Scanner for user input

public class CafeOrderProgram { // Class name (same as filename)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask for number of orders
        System.out.print("Enter the number of orders: ");
        int n = input.nextInt();
        input.nextLine(); // Consume leftover newline

        // Step 2: Create arrays to store order names and prices
        String[] orderNames = new String[n];
        double[] orderPrices = new double[n];

        // Step 3: Input each order name and price
        for (int i = 0; i < n; i++) {
            System.out.println("\nOrder " + (i + 1) + ":");
            System.out.print("Enter food/drink name: ");
            orderNames[i] = input.nextLine();

            System.out.print("Enter price: ");
            orderPrices[i] = input.nextDouble();
            input.nextLine(); // Consume newline
        }

        // Step 4: Calculate total cost
        double total = 0;
        for (int i = 0; i < n; i++) {
            total += orderPrices[i];
        }

        // Step 5: Display all orders and total
        System.out.println("\n===== LIST OF ORDERS =====");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + orderNames[i] + " - Rp " + orderPrices[i]);
        }
        System.out.println("==========================");
        System.out.println("Total cost: Rp " + total);
    }
}
