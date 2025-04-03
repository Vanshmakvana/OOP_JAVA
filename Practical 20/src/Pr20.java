class Demo {
    private String message;

    public Demo(String msg) {
        this.message = msg;
    }

    private void showMessage() {
        System.out.println("Private Message: " + message);
    }

    public void display() {
        showMessage();
    }
}

public class Pr20 {
    public static void main(String[] args) {
        Demo obj = new Demo("Hello from private variable!");
        obj.display();
    }
}