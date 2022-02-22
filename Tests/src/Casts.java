class A1{
    A1(){
        System.out.println("A");
    }
}
class B1 extends  A1{
    B1(){
        System.out.println("B");
    }
}
class C1 extends A1{}

public class Casts {
    public static void main(String[] args) {
        A1 b = null;
        A1 c = new C1();
        C1 c2 = (C1)c;
//        C1 c3 = (C1)b;
        A1 a = new A1();
        A1 a2 = (A1)b;
        B1 b2 = (B1)b;
    }
}
