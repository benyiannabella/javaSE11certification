public class StaticInner {
    static Double d1;
    static int x = d1.intValue();

    static Character obj;
    char c = obj.charValue();



    public static void main(String[] args) {
        System.out.println("Hello");

    }

}
