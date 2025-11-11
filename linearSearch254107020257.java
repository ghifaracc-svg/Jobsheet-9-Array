import java.util.Scanner; // Import Scanner library for user input

public class linearSearch254107020257 { // Replace 12345 with your student ID
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] data = {3, 7, 1, 9, 5, 2, 8}; // Array data
        System.out.print("Enter the number to search: ");
        int key = input.nextInt(); // Number to be searched

        boolean found = false; // Flag to check if found
        int result = -1; // Store index if found

        // Linear search process
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                found = true;
                result = i;
                break; // Exit loop when found
            }
        }

        // Display results
        System.out.println("The key in the array is located at index position: " + result);
    }
}
