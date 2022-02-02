interface Interface1{
    public static void log(){
        System.out.println("interface log");
    }
}

class A{
    public static void log(){
        System.out.println("class log");
    }
}

class B extends A implements Interface1{
}

public class StaticMethod {
    public static void main(String[] args) {
        Interface1 i = new B();
        Interface1.log();
        A a = new B();
        a.log();
        B b = new B();
        b.log();
    }
}
