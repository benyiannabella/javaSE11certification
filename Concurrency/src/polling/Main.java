package polling;

import java.sql.SQLOutput;

public class Main {
    public static int count;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("start main");
        new Thread(()-> {
            for (int i = 0; i < 100; i++){ count++;
            System.out.println("child thread running");}
        }).start();

        while (count < 100) {
            System.out.println("waiting for the child to finish");
            Thread.sleep(1);
        }
        for(int i = 0; i<10; i++) System.out.println("main running");
        System.out.println("main thread finished");
    }
}
