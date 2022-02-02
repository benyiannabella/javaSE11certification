class Outer1 {
    public void print(int x) {
        class Inner {
            public void getX() {
                System.out.println(x);
            }
        }
        Inner inner = new Inner();
        inner.getX();
    }
}

public class Test3 {
    public static void main(String[] args) {
        new Outer1().print(100);
    }
}