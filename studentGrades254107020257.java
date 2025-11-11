import java.util.Scanner;

public class studentGrades254107020257 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask for number of student grades
        System.out.print("Enter the number of student grades: ");
        int n = input.nextInt();

        int[] grades = new int[n]; // Array to store grades

        // Step 2: Input each student's grade
        System.out.println("\nEnter each student's grade:");
        for (int i = 0; i < n; i++) {
            System.out.print("Grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        // Step 3: Calculate total, highest, and lowest
        int total = 0;
        int highest = grades[0];
        int lowest = grades[0];

        for (int i = 0; i < n; i++) {
            total += grades[i];
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        // Step 4: Calculate average
        double average = (double) total / n;

        // Step 5: Display results
        System.out.println("\n=== Results ===");
        System.out.println("All grades: ");
        for (int i = 0; i < n; i++) {
            System.out.print(grades[i] + " ");
        }
        System.out.println("\nAverage grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        input.close();
    }
}
