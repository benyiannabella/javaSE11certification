public class Test {

    public static int add(int a, int b, StringBuilder stringB){
        a++;
        b-=3;
        stringB = stringB.append("test");
        System.out.println("x = " + a);
        System.out.println("y = " + b);
        System.out.println(stringB);
        return a+b;
    }

    public static void main(String[] args) {
        int x = 6;
        int y = 5;
        StringBuilder sb = new StringBuilder("hello ");
        int result = Test.add(x,y,sb);
        System.out.println("x = " + x + ", y = " + y + ", result = " + result + ", sb = " + sb);
    }
}
