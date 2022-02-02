public class IfElse {

    public static void main(String[] args) {

        boolean flag = true;
        boolean subflag = true;
        if (flag) ;
        else System.out.println("1.flag is false");

        if (flag)
            if (subflag) System.out.println("1.subflag is true");
            else System.out.println("2.subflag is false");
        else System.out.println("2.flag is false");

        if (flag)
            if (subflag) System.out.println("3.subflag true");
        else System.out.println("3.flag false");

        if(flag)
            if(subflag) System.out.println("4.subflag true");
        else System.out.println("4.subflag false");
        else System.out.println("4.flag false");

        flag = false;
        if(flag=true){
            System.out.println("5.Flag is true");
        } else {
            System.out.println("5.flag is false");
        }

        boolean a = false;
        boolean b = false;
        boolean c = false;

        if((a = true) || (b = true) && (c = true));
        System.out.println(a + " " + b + " " + c);

         a = false;
         b = false;
         c = false;

        if((a = true) && (b = true) || (c = true));
        System.out.println(a + " " + b + " " + c);
    }
}
