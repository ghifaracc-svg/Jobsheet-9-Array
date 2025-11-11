import java.util.Scanner; // Import Scanner for user input

public class linearSearch254107020257 { // Replace 12345 with your student ID
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Ask for number of elements
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] data = new int[n]; // Create array with size n

        // Step 2: Ask user to input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i) + ": ");
            data[i] = input.nextInt();
        }

        // Step 3: Ask user for the key to search
        System.out.print("Enter the number to search: ");
        int key = input.nextInt();

        // Step 4: Linear search process
        int index = -1; // store the index if found
        for (int i = 0; i < n; i++) {
            if (data[i] == key) {
                index = i;
                break; // stop when found
            }
        }

        // Step 5: Display result
        if (index != -1) {
            System.out.println("The key in the array is located at index position: " + index);
        } else {
            System.out.println("The key was not found in the array.");
        }

        input.close();
    }
}
