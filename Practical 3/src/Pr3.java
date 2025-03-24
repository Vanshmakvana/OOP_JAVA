import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a single character: ");
        char input = sc.next().toLowerCase().charAt(0);

        if (Character.isLetter(input)) {
            if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
                System.out.println(input + " is a vowel.");
            } else {
                System.out.println(input + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet character.");
        }
    }
}