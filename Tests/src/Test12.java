class A{

    static void getHome(){
        System.out.println("I am home in class A");
    }
}

class B extends A{
    static void getHome(){
        System.out.println("I am home in class B");
    }
}


public class Test12 {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        ((A)a).getHome();
        ((A)b).getHome();
    }
}
