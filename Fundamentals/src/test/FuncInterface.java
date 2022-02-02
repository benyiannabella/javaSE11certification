package test;

@FunctionalInterface
interface MyInt{
    public String toString();
    public boolean equals(Object o);
    public int hashCode();
    void testIfFunc();
}
public class FuncInterface {
    public static void main(String[] args) {
        MyInt myInt = ()-> System.out.println("Hello");
        myInt.testIfFunc();
    }
}
