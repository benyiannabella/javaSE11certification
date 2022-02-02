
class Outer2 {
    private String name;
    static int counter = 0;
    {
        System.out.println(++counter + ". Outer class instance initializer");
    }

    static {
        System.out.println(++counter + ". Outer class static initializer");
    }
    Outer2(String name){
        this.name = name;
        System.out.println(++counter+ ". I am an outer class - constructor");
    }
    class Inner1 {
        String name;
        {
            System.out.println(++counter +". Inner class instance initializer");
        }

        Inner1(String name){
            this.name = name;
            System.out.println(++counter + ". I am an inner class - constructor");
            System.out.println("Outer class name: " + Outer2.this.name);
        }
    }
}

public class InnerTest {
    public static void main(String[] args) {
        Outer2.Inner1 inner = new Outer2("outer").new Inner1("inner");
        System.out.println("Inner class name: " + inner.name);
        System.out.println("Total prints counted: " + Outer2.counter);
    }
}
