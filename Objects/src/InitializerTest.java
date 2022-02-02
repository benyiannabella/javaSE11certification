class InitTest {


    static String three  = "three";
    static {
        System.out.println("parent static variable " + three);
    }

    InitTest(){
        System.out.println("parent constructor");
    }

}

class IniTestSub extends InitTest{
    String one = "one";
    {
        System.out.println(one);
    }
    String two = "two";
    {
        System.out.println(two);
    }

    static String four  = "four";
    static {
        System.out.println("child static variable " + four);
    }
    IniTestSub(){
//        super();
        System.out.println("child class constructor");
    }
}

public class InitializerTest {
    public static void main(String[] args) {

        IniTestSub initTest = new IniTestSub();
    }
}