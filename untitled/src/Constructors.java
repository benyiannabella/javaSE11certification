class ParentA {
    String name;

    ParentA(String name){
        System.out.println("parent constructor " + name);
    }
}

class ChildB extends ParentA{
    String name;

     ChildB(String name){
        super("ABC");
        this.name = name;
        System.out.println("child constructor " + name);
    }
}

public class Constructors {
    public static void main(String[] args) {

        ChildB childB = new ChildB("EFG");
    }
}
