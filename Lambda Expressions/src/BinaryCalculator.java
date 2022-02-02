public class BinaryCalculator {

    interface Calculator {
        int calculate(int a, int b);
    }

    public int calculator(int a, int b, Calculator c) {
        return c.calculate(a, b);
    }

    public static void main(String[] args) {

        BinaryCalculator myApp = new BinaryCalculator();

        Calculator addition = (int a, int b) -> a + b;
        Calculator subtraction = (a, b) -> a - b;
        Calculator division = (var a, var b) -> a / b;

        int aValue = 4;
        int bValue = 2;

        System.out.println("Addition = " + myApp.calculator(aValue, bValue, addition));
        System.out.println("Addition = " + myApp.calculator(aValue, bValue, subtraction));
        System.out.println("Addition = " + myApp.calculator(aValue, bValue, division));
    }

}
