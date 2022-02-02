interface Extendable {
    void extend();
    default void defaultMethod(){
        System.out.println("I am default in Extendable");
    }

}

interface SubExtendable extends Extendable{

    void append();
}

public class InterfacesExample implements SubExtendable{
    public static void main(String[] args) {
        InterfacesExample ie = new InterfacesExample();
        ie.extend();
    }

    @Override
    public void extend() {
        System.out.println("Implement Extendable interface extend method");
        append();
        defaultMethod();
    }


    @Override
    public void append() {
        System.out.println("Append method from SubExtendable");
    }
}
