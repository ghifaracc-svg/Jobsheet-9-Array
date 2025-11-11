import java.util.Scanner;

public class arrayAverageScore254107020257 { // 254107020257 = your student ID
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt(); // number of students

        int[] score = new int[n]; // dynamic array based on user input

        int totalPass = 0, totalFail = 0; // sum of passed and failed scores
        int countPass = 0, countFail = 0; // counters for passed and failed students

        // Input scores
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = input.nextInt();

            // Check if passed or failed
            if (score[i] > 70) {
                totalPass += score[i];
                countPass++;
            } else {
                totalFail += score[i];
                countFail++;
            }
        }

        // Calculate averages (avoid division by zero)
        double avgPass = (countPass > 0) ? (double) totalPass / countPass : 0;
        double avgFail = (countFail > 0) ? (double) totalFail / countFail : 0;

        // Display results
        System.out.println("\nThe average score of students who passed is " + avgPass);
        System.out.println("The average score of students who failed is " + avgFail);

        input.close();
    }
}
