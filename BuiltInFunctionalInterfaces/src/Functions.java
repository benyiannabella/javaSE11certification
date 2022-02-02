import java.util.function.BiFunction;
import java.util.function.Function;

public class Functions {


    public static void main(String[] args) {
        Function<String, Integer> f = a -> a.length();
        Function<String, Integer> f1 = String :: length;
        System.out.println(f.apply("hello"));
        System.out.println(f.apply("next"));

        BiFunction<String, String, String> bf = (a, b) -> a.concat(b);
        BiFunction<String, String, String> bf1 = String :: concat;
        System.out.println(bf.apply("hello", " world"));
        System.out.println(bf1.apply("nice ", " weather"));
    }
}
