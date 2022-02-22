package runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting main method");
        System.out.println("________________________");
        for(int i = 0; i < 5; i++) System.out.println("Running main thread");
        Runnable myThread = new MyRunnable();
        Thread t = new Thread(myThread);
        t.start();
        System.out.println("____________________________");
        System.out.println("Ending main method");

        new Thread(()->{
            System.out.println("_________________________________");
            System.out.println("New implementation of runnable");
            for(int i=0; i<5;i++) System.out.println("Running second child thread");
        }).start();
    }
}
