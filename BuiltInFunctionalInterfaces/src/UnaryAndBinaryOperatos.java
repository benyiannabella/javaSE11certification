import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatos {
    public static void main(String[] args) {

        UnaryOperator<String> s = String :: toLowerCase;
        System.out.println(s.apply("HELLO"));
        UnaryOperator<String> s1 = a-> a.toUpperCase();
        System.out.println(s1.apply("jello"));

        BinaryOperator<String> s2 = (a, b) -> a.concat(b);
        BinaryOperator<String> s3 = String :: concat;
        System.out.println(s2.apply("hi", " you"));
        System.out.println(s3.apply("good", " morning"));
    }
}
