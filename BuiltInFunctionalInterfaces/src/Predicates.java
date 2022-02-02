import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {
        Predicate<List<String>> p = List :: isEmpty;
        List<String> l = new ArrayList<>();
        System.out.println(p.test(l));

        BiPredicate<String, String> p1 = String :: startsWith;
        System.out.println(p1.test("hello", "he"));
    }
}
