class Pr19 {
    private String message;

    public Pr19() {
        this("Hello from parameterized constructor!");
    }

    public Pr19(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println("Message: " + this.message);
    }

    public static void main(String[] args) {
        Pr19 obj = new Pr19();
        obj.display();
    }
}