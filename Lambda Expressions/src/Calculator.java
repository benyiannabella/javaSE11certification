import java.util.function.IntUnaryOperator;

public class Calculator {

    //functional interface - one abstract method;
//    interface UnaryIntegerOperation{
//        int calculate(int a);
//    }

    public int calculate(int a, IntUnaryOperator op){
        return op.applyAsInt(a);
    }

    public static void main(String[] args) {

        Calculator myApp = new Calculator();

        IntUnaryOperator square = (a) -> a * a;
        IntUnaryOperator cube = (a) -> a * a * a;
        IntUnaryOperator increment =  a -> a + 1;
        IntUnaryOperator decrement = a -> {
            return a - 1;
        };

        int value = 2;
        System.out.println("Cube = " + myApp.calculate(value, cube));
        System.out.println("Square = " + myApp.calculate(value, square));
        System.out.println("Increment = " + myApp.calculate(value, increment));
        System.out.println("Decrement = " + myApp.calculate(value, decrement));

    }
}
