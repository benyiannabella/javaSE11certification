class StaticIntExample {
    static int statementOrder;
    static int firstVariable = clarifyOrder("assigning firstVariable");

    int thirdVariable = clarifyOrder1("assigning thirdVariable");

    //instance initializer
    {
        clarifyOrder1("executing init 3");
    }

    //static init 1
    static {
        clarifyOrder("executing init 1");
    }

    static int secondVariable = clarifyOrder("assigning secondVariable");

    static {
        clarifyOrder("executing init 2");
    }

    StaticIntExample(){
        clarifyOrder1("constructor");
    }



    static int clarifyOrder(String message){
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }

    int clarifyOrder1(String message){
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }
}

public class StaticInitializer {
    public static void main(String[] args) {
        StaticIntExample staticIntExample = new StaticIntExample();
//        System.out.println("statements made so far = " + StaticIntExample.statementOrder);
    }
}