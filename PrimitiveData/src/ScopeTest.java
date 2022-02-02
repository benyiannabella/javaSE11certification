public class ScopeTest {
    static String value = "value";
    public static void main(String[] args) {

        int num = 2;
        if(num<2){
            //variables already defined in the scope
            String value = "new value";
//            int num = 3;
        }

        class nestedTest{
            String value = "new value2";


        }
    }
}
