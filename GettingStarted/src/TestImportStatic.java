
//single static import for static variable
import static java.lang.Math.PI;

//single static import for static variable
import static java.lang.Math.sqrt;

//single static import on demand
//import static java.lang.Math.*;

public class TestImportStatic {
    public static void main(String[] args) {
        int radius = 2;

        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        double sqr81 = sqrt(81);
        System.out.println("sqrt81 = " + sqr81);

    }

}
