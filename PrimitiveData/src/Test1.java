public class Test1 {
    static int s=2;

    public static void main(String[] args) {
        System.out.println(Test1.s);
         int s = 1;
        System.out.println(s);
//        s=Test.s;
        System.out.println(Test1.s);
        short myShort = 0;
        int min = Short.MIN_VALUE;
        int max = Short.MAX_VALUE;
        int looping = 0;

        for(int i=min; i <= max; i++){
            myShort=(short)i;
            count(i, myShort);
        }


    }
    static void count(int i, short s){
        if(s == Short.MIN_VALUE) System.out.println("min - " + i);
        if(s == Short.MAX_VALUE) System.out.println("max - " + i);
    }

}
