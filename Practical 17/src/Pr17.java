class Pr17 {
    int roll;
    String name;
    double cgpa;

    public Pr17(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    public static void compareCGPA(Pr17 s1, Pr17 s2) {
        if (s1.cgpa > s2.cgpa) {
            System.out.println(s1.name + " (Roll No: " + s1.roll + ") has a higher CGPA and gets an A grade.");
        } else if (s1.cgpa < s2.cgpa) {
            System.out.println(s2.name + " (Roll No: " + s2.roll + ") has a higher CGPA and gets an A grade.");
        } else {
            System.out.println("Both students " + s1.name + " and " + s2.name + " have the same CGPA.");
        }
    }

    public static void main(String[] args) {
        Pr17 s1 = new Pr17(101, "Vansh", 8.3);
        Pr17 s2 = new Pr17(102, "Virat", 7.5);
        compareCGPA(s1, s2);
    }
}