package test;

import static test.StaticNested.Nest;

public class StaticNested2 {
    private final int height = 10;

    public int calculate(){
        int width = 5;
//        width =2;
        class Calculator{
            public int calc(){
                return width*height;
            }
        }
        Calculator calculator = new Calculator();
        return calculator.calc();
    }

    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {
            public int multiply() {
                return length * width * height; // DOES NOT COMPILE
            }
        }
//        width = 2;
    }

    public static void main(String[] args) {
//        Nest nest = new Nest();
//        System.out.println(nest.getName());
        StaticNested2 staticNested2 = new StaticNested2();
        System.out.println(staticNested2.calculate());

    }
}
