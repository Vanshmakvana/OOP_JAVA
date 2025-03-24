import java.util.Scanner;

public class Pr11 {
    public static int[] bubbleSort(int[] ar) {
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {

                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = s.nextInt();

        int[] ar = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            ar[i] = s.nextInt();
        }

        int[] sortedArray = bubbleSort(ar);

        System.out.println("Sorted array:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
