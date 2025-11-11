import java.util.Scanner; // Step 3: Add Scanner library

public class arrayValue254107020257 { // Step 1: File and class name must match
    public static void main(String[] args) { // Step 2: Basic structure with main()
        
        Scanner input = new Scanner(System.in);

        // Step 4: Create an integer array named finalScore
        int[] finalScore = new int[10];

        // Step 5: Input data from user
        System.out.println("=== Input Final Scores ===");
        for (int i = 0; i < finalScore.length; i++) {
            System.out.print("Enter score number " + (i) + ": ");
            finalScore[i] = input.nextInt();
        }

        // Step 6 (Modified): Display only students who passed (score > 70)
        System.out.println("\n=== List of Students Who Passed ===");
        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
                System.out.println("Student " + (i) + " Passed!");
            }
        }

        input.close(); // Close the scanner
    }
}
