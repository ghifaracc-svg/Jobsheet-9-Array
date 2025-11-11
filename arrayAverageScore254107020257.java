import java.util.Scanner; // Step 3: Add Scanner library

public class arrayAverageScore254107020257 { // Step 1: File and class name (XX = your student ID)
    public static void main(String[] args) { // Step 2: Basic Java structure with main()

        Scanner input = new Scanner(System.in); // Step 3: Create Scanner object

        int[] score = new int[10]; // Step 4: Declare integer array with capacity 10
        int total = 0;             // Declare total variable
        double average;            // Declare average variable

        // Step 5: Input scores using loop
        for (int i = 0; i < score.length; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            score[i] = input.nextInt();
        }

        // Step 6: Calculate total using loop
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        // Step 7: Calculate average
        average = (double) total / score.length;

        // Display the result
        System.out.println("\nTotal score of 10 students: " + total);
        System.out.println("Average score: " + average);

        input.close(); // Close scanner
    }
}
