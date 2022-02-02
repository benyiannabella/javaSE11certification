import java.time.format.TextStyle;

public class Test {

    private static int outerNum = 8;
    private String name = "Outer";

    public String getName(){
        var nested = new Test.IAmNested();
        System.out.println(nested.name);
        nested.getName();
        System.out.println(IAmNested.nestedNum);
        IAmNested.sayHelloNested();
        return this.name;

    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    static class IAmNested{
        private static int nestedNum = 10;
        private String name = "Nested";

        public String getName(){
            return this.name;

        }

        public static void sayHelloNested(){
            System.out.println("Hello Nested");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.getName();
    }


}
