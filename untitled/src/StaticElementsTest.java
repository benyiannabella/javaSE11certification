class StaticStuff{

    static  final String appName = "A Good App";

    static {
        System.out.println("initializing StaticStuff class");
        StaticStuff.counter++;
    }

    static void printAppName(){
        System.out.println("Application name : " + appName + ": counter = " + counter);
    }

    static int counter;
}


public class StaticElementsTest {
    public static void main(String[] args) {

        for (int i =0; i<3; i++){
            System.out.println(i);
        }

//
//        StaticStuff  staticStuff = new StaticStuff();
//        System.out.println("Created instance of staticStaff");
        System.out.println(StaticStuff.appName);
//        StaticStuff.printAppName();

        int a = StaticStuff.counter;
        System.out.println(a);
    }
}
