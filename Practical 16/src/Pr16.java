import java.util.Scanner;
class Pr16 {
    private int[] array;
    private int inputInteger;

    public Pr16(int size, int inputInteger) {
        this.array = new int[size];
        this.inputInteger = inputInteger;
    }

    public void fillArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter " + array.length + " elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
    }

    public void calculateProduct() {
        int min = findMinimum();
        int product = min * inputInteger;
        System.out.println("The product of " + inputInteger + " and the minimum element (" + min + ") is: " + product);
    }

    private int findMinimum() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.print("Enter an integer: ");
        int inputInteger = sc.nextInt();
        Pr16 calculator = new Pr16(size, inputInteger);
        calculator.fillArray();
        calculator.calculateProduct();
    }
}
