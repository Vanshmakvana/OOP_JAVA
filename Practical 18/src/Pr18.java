class Pr18 {
    int rollNo;
    String name;
    double cgpa;

    public Pr18(int rollNo, String name, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.cgpa = cgpa;
    }

    public void checkResult() {
        if (this.cgpa < 5.0) {
            System.out.println(this.name + " (Roll No: " + this.rollNo + ") has a CGPA of " + this.cgpa + " and has failed.");
        } else {
            System.out.println(this.name + " (Roll No: " + this.rollNo + ") has a CGPA of " + this.cgpa + " and has passed.");
        }
    }

    public static void main(String[] args) {
        Pr18[] students = new Pr18[10];

        students[0] = new Pr18(101, "Vansh", 8.6);
        students[1] = new Pr18(102, "Roy", 6.2);
        students[2] = new Pr18(103, "Virat", 3.8);
        students[3] = new Pr18(104, "Ezio", 7.0);
        students[4] = new Pr18(105, "Vivek", 5.5);
        students[5] = new Pr18(106, "Ram", 8.9);
        students[6] = new Pr18(107, "Jay", 4.0);
        students[7] = new Pr18(108, "Viraj", 9.1);
        students[8] = new Pr18(109, "Vikas", 6.8);
        students[9] = new Pr18(110, "Akash", 4.9);

        for (Pr18 student : students) {
            student.checkResult();
        }
    }
}