package runnable;

public class MyRunnable implements Runnable{

    @Override
    public void run(){
        System.out.println("Starting first child thread!");
        System.out.println("___________________________________");
        for(int i=0;i<5; i++) System.out.println("running first child thread");
        System.out.println("______________________________");
    }
}
