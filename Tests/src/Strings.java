public class Strings {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");
        String s3 = s2.toString();

//        System.out.println("s1 == s2 " + s1 == s2);
//        System.out.println("s2 == s3 " + s2 == s3);
//        System.out.println("s1 == s3 " + s1 == s3);
//        System.out.println(s2.toString() == s3.toString());

        StringBuilder sb = new StringBuilder("B");
        sb.append(sb.append("A"));
//        System.out.println(sb);


//        int i = 10;
//        change(sb,i);
//        System.out.println(sb + ", " + i);


//        var a = 3; //Line n1
//        var b = 5; //Line n2
//        var c = 7; //Line n3
//        var d = 9; //Line n4
//        boolean res = --a + --b > 1 && c++ + d++ > 1;
//        System.out.printf("a = %d, b = %d, c = %d, d = %d, res = %b", a, b, c, d, res);

        String str = " "; //single space
        boolean b1 = str.isEmpty();
        boolean b2 = str.isBlank();
        System.out.println(str.length() + " " + str);
        System.out.println(b1 + " : " + b2); //Line n1

        str.strip(); //Line n2
        b1 = str.isEmpty();
        b2 = str.isBlank();
        System.out.println(str.length());
        System.out.println(b1 + " : " + b2); //Line n3fal

        Boolean flag;
        flag = false;

        int count = 0;
        while(!flag){
            System.out.println("____false___");
            flag = true;
            count++;
        }
        System.out.println(count);


        var i = 4; //Line n1
        for(i = 0; i <= 2; i++){} //Line n2
        System.out.println(i); //Line n3
    }

    public static void change(StringBuilder s, int i){
        s= new StringBuilder();
        s.append((String) null);
        i+=10;
    }
}
