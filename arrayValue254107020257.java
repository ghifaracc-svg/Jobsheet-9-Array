import java.util.Scanner;  // Step 3: Add the Scanner library

public class arrayValue254107020257  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object

        // Step 4: Create an integer array with 10 elements
        int[] finalScore = new int[10];

        // Step 5: Use a loop to input values for each element
        System.out.println("Enter 10 final scores:");
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            finalScore[i] = input.nextInt();
        }

        System.out.println(); // Empty line for readability

        // Step 6: Use a loop to display all elements of the array
        System.out.println("The final scores are:");
        for (int i = 0; i < finalScore.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + finalScore[i]);
        }

        input.close(); // Close the Scanner
    }
}
