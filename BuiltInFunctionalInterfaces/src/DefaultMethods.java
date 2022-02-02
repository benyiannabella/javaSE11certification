import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DefaultMethods {
    public static void main(String[] args) {


        Predicate<String> p1 = a -> a.contains("test");
        Predicate<String> p2 = a -> a.contains(" case");

        Predicate<String> p3 = p1.and(p2);
        System.out.println(p3.test("test case"));

        Predicate<String> p4 = p1.and(p2.negate());
        System.out.println(p4.test("test mode"));

        Consumer<String> c = x -> System.out.println("1." + x);
        Consumer<String> c2 = x -> System.out.println("2." + x);

        Consumer<String> c3 = c.andThen(c2);
        c3.accept("hello");

        Function<Integer, Integer> first =  x -> x+2;
        Function<Integer, Integer> last =  x -> x*2;
        Function<Integer, Integer> result = last.compose(first);
        System.out.println(result.apply(3));

    }
}
