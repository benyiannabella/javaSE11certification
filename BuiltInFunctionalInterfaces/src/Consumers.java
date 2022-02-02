import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {
        Consumer<String> c = System.out::println;
        Consumer<String> c1 = a -> System.out.println(a);
        c.accept("Hello");
        c1.accept("Bye");

        BiConsumer<Integer, Integer> bc = (a,b)-> System.out.println(a+b);
        bc.accept(2,3);

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> bi = map :: put;
        BiConsumer<String, Integer> bi1 = (a, b) -> map.put(a, b);
        bi.accept("duck", 2);
        System.out.println(map);
    }
}
