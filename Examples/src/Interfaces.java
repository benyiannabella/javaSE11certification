interface I1 {
    default void getText() {
        System.out.println("interface default method");
    }
}

interface I2 extends I1 {

    default void getText() {
        System.out.println("interface2 default method");
    }

}

class C1 implements I1, I2 {
//    public void getText() {
//        System.out.println("default method overridden");
//    }
}

public class Interfaces {
    public static void main(String[] args) {
        I1 i = new C1();
        i.getText();
    }
}
