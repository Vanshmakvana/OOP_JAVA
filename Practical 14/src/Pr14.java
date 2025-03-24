import java.util.Scanner;
public class Pr14 {

    public static int gradeScore(int ext) {
        return ext;
    }

    public static int gradeScore(int mid, int prac) {
        return mid + prac;
    }

    public static float gradeScore(float viva) {
        return viva;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter External Marks (out of 70): ");
        int ext = gradeScore(s.nextInt());

        System.out.print("Enter Mid Marks (out of 30): ");
        int mid = s.nextInt();
        System.out.print("Enter Practical Marks (out of 20): ");
        int prac = s.nextInt();
        int totalInt = gradeScore(mid, prac);

        System.out.print("Enter Viva Marks (out of 30): ");
        float viva = gradeScore(s.nextFloat());
        int total = ext + totalInt + (int) viva;
        float percentage = (total / 150.0f) * 100;

        char overallGrade;
        if (percentage >= 85) {
            overallGrade = 'A';
        } else if (percentage >= 70) {
            overallGrade = 'B';
        } else if (percentage >= 50) {
            overallGrade = 'C';
        } else if (percentage >= 35) {
            overallGrade = 'D';
        } else {
            overallGrade = 'F';
        }

        System.out.println("Total Marks (out of 150): " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Overall Grade: " + overallGrade);
    }
}
