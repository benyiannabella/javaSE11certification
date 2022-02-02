public class Test2 {
    public static void main(String[] args) {

//        char a = 'a';
//        int i = a;
//        System.out.println(i);
//
//        int x = 5____0;
//
////        int y = ____50;
////
////        int z = 50____;
//
//        float f = 123.76_86f;
//
//        double d = 1_2_3_4;
//
//        byte b1 = 10; //Line n1
//        int i1 = b1; //Line n2
////        byte b2 = i1; //Line n3
//
//         int i2 = 10;
////        short s = i2;
//
//        Boolean b = Boolean.valueOf("tRuE");
//
//
//        Boolean b0 = Boolean.valueOf("tRuE");
//        Boolean b2 = Boolean.valueOf("fAlSe");
//        Boolean b3 = Boolean.valueOf("abc");
//        Boolean b4 = null;
//        System.out.println(b0 + ":" + b2 + ":" + b3 + ":" + b4);
//


//        add(10.0, null);

        m(1.0);
        extractInt(2.7);
//        extractInt(2);

        System.out.println("Equals??? " + (10 != 5));

        byte var = 127;
        var=var;
    }
    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }

}
