class OrderClass {

    static int statementOrder;
    int a = clarify("assigning a");

    //initializer 1
    {
        clarify("initializer 1");
    }

    int b = clarify("assigning b");

    //initializer 2
    {
        clarify("initializer 2");
    }

    //constructor
    OrderClass() {
        clarify("constructor");
    }

    int c = clarify("assigning c");

    //initializer 3
    {
        clarify("initializer 3");
    }

    int clarify(String message) {
        statementOrder++;
        System.out.println(statementOrder + " " + message);
        return statementOrder;
    }

}

public class InitializerOrder {
    public static void main(String[] args) {

        OrderClass o = new OrderClass();
    }
}
