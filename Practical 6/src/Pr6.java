import java.util.Scanner;

public class Pr6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first integer:");
        int n1 = s.nextInt();
        System.out.println("Enter the second integer:");
        int n2 = s.nextInt();
        System.out.println("Enter the third integer:");
        int n3 = s.nextInt();

        int first, second, third;

        if (n1 >= n2 && n1 >= n3) {
            first = n1;
            if (n2 >= n3) {
                second = n2;
                third = n3;
            } else {
                second = n3;
                third = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            first = n2;
            if (n1 >= n3) {
                second = n1;
                third = n3;
            } else {
                second = n3;
                third = n1;
            }
        } else {
            first = n3;
            if (n1 >= n2) {
                second = n1;
                third = n2;
            } else {
                second = n2;
                third = n1;
            }
        }
        System.out.println("The integers in descending order are: " + first + ", " + second + ", " + third);
    }
}
