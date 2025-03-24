import java.util.Scanner;

public class Pr12 {
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = s.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = s.nextInt();

        int result = gcd(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + result);
    }
}
