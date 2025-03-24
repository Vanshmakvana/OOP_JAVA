import java.util.Scanner;

public class Pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double METERS_TO_FEET = 3.28084;
        System.out.print("Enter the value in meters: ");
        double meters = sc.nextDouble();
        double feet = meters * METERS_TO_FEET;
        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }
}