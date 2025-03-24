import java.util.Scanner;
class Pr15 {
    private int[] array;
    private int size;

    public Pr15(int size) {
        this.size = size;
        this.array = new int[size];
    }

    public void fillArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
    }

    public void findMinimum() {
        int min = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        print("Minimum", min);
    }

    public void findMaximum() {
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        print("Maximum", max);
    }

    private void print(String type, int value) {
        System.out.println(type + " value of the array is: " + value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        Pr15 operations = new Pr15(size);
        operations.fillArray();
        operations.findMinimum();
        operations.findMaximum();
    }
}
