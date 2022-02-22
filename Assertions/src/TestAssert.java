public class TestAssert {
    public static void main(String[] args) {
        int num = -5;
        assert num>0 : "num - " + num + " not bigger than 0";
        System.out.println(num + " bigger than 0");
    }
}
