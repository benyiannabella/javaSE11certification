public class BinaryOperator {

    public static void main(String[] args) {


        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;

        int result = a + e * b - f / c % b; //a+10-0=1+10+11
        System.out.println("result = " + result);

        System.out.println("______Shift_______");
        System.out.println("result left shift 00000001 << 2 = " +
                String.format("%8s", Integer.toBinaryString(0b00000001 << 2)).replace(' ', '0'));
        System.out.println("result left shift 10001000 >> 3 = " +
                String.format("%8s", Integer.toBinaryString(0b10001000 >> 3)).replace(' ', '0'));


        System.out.println("_____Conditional and logical op_____________");

        a = 0;
        b = 10;

        if((++a > b) && (++a >= b)){
            System.out.println("condition met");
        }

        System.out.println("++a && a = " + a + ",b = " + b);

        a = 0;
        b = 10;
        if((++a > b) & (++a >= b)){
            System.out.println("condition met");
        }

        System.out.println("++a & a = " + a + ",b = " + b);

        a = 0;
        b = 10;
        if((a++ > b) && (a++ >= b)){
            System.out.println("condition met");
        }

        System.out.println("a++ && a = " + a + ",b = " + b);


        a = 0;
        b = 10;
        if((a++ > b) & (a++ >= b)){
            System.out.println("condition met");
        }

        System.out.println("a++ & a = " + a + ",b = " + b);

        a = 0;
        b = 10;

        if((++a > b) || (++a >= b)){
            System.out.println("condition met");
        }

        System.out.println("++a || a = " + a + ",b = " + b);

        a = 0;
        b = 10;
        if((++a > b) | (++a >= b)){
            System.out.println("condition met");
        }

        System.out.println("++a | a = " + a + ",b = " + b);

        a = 0;
        b = 10;
        if((a++ > b) || (a++ >= b)){
            System.out.println("condition met");
        }

        System.out.println("a++ ||a = " + a + ",b = " + b);


        a = 0;
        b = 10;
        if((a++ > b) | (a++ >= b)){
            System.out.println("condition met");
        }

        System.out.println("a++ | a = " + a + ",b = " + b);
    }
}
