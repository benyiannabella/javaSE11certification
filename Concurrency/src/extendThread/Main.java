package extendThread;

public class Main {
    public static void main(String[] args) {
        System.out.println("main method start");
        new MyThread().start();
        System.out.println("main method ends");
    }
}
