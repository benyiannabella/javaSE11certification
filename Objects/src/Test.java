class TestStatic {
    static String name = "Mary";

    public static String getName() {
        return name;
    }
}

public class Test {

    public static void main(String[] args) {
        TestStatic t0 = new TestStatic();
        TestStatic t1 = null;

        System.out.println(t0.name);
        System.out.println(t0.getName());
        System.out.println(TestStatic.getName());
        System.out.println(TestStatic.name);
        System.out.println(t1.name);
        System.out.println(t1.getName());


        //*   Insert code here *//

    }
}