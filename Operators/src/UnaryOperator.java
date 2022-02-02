public class UnaryOperator {
    public static void main(String[] args) {
        System.out.println("_______Test1_________");
        int a;
        a = 1;
        ++a;
        System.out.println("print after ++a = " + a);

        a = 1;
        a++;
        System.out.println("print after a++ = " + a);

        System.out.println("________Test2__________");
        a = 1;
        System.out.println("a after ++a = " + ++a);

        a = 1;
        System.out.println("a after a++ = " + a++);
        System.out.println("a is = " + a);

        System.out.println("__________Test3________");
        a = 1;
        int a2 = a++;
        System.out.println("the value of a is = " + a);
        System.out.println("the value of a2 is = " + a2);

        System.out.println("__________Test4________");
        a = 1;

        if(++a == 1){
            System.out.println("If Statement, now the value of a is = " + a);
        }
        System.out.println(" a != 1, the value of a is = " + a);

        System.out.println("________Test5____________");
        int b = 5;
        int loopIteration = 0;
        while(--b > 0){
            loopIteration++;
        }
        System.out.println("loopIteration = " + loopIteration + " b value = " + b);

        System.out.println("________Test6____________");
        int b2 = 5;
        int loopIteration2 = 0;
        while(b2-- > 0){
            loopIteration2++;
        }
        System.out.println("loopIteration = " + loopIteration2 + " b value = " + b2);

        System.out.println("_______Test7_______");

        a = 1;
        b = +a;
        System.out.println("a = " + a + ", b = " + b);

        a = -1;
        b = -a;
        System.out.println("a = " + a + ", b = " + b);



    }

}
