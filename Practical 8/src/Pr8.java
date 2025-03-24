import java.util.Scanner;

public class Pr8 {

    // User-defined method for linear search

    public static int linearSearch(int[] a) {
        Scanner s = new Scanner(System.in);

        // Ask the user for the element to search

        System.out.print("Enter the element to search: ");
        int t = s.nextInt();

        // Perform linear search

        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                return i; // Return index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input array size

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        // Initialize array and input elements

        int[] a = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }

        // Call the linearSearch method

        int result = linearSearch(a);

        // Display the result

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        // scanner.close();
    }
}
