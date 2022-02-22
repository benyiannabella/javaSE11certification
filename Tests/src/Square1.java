abstract class Trapezoid {
    public int getEqualSides() {return 0;}
}
abstract class Rectangle extends Trapezoid {
//    public static int getEqualSides() {return 2;}
// x1
}
public final class Square1 extends Rectangle {
    public int getEqualSides() {return 4;}
    // x2
    public static void main(String[] corners) {
        final Square1 myFigure = new Square1();
// x3
        System.out.print(myFigure.getEqualSides());
    }
}