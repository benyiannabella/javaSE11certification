import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SuppliedInterfaceTest {

    public static void main(String[] args) {

        String[] dictionary = new String[]{"Angry", "Apple", "Art",
                "Ball", "Box", "Bump",
                "Cap", "Car", "Cone",
                "Dart", "Dog", "Duck"};

        //consumer - takes parameter, no return
        Consumer<String> str = s -> {
            StringBuilder sb = new StringBuilder(s);
            sb.insert(0, "MyApplication: ConsumerInterfaceTest : ");
            sb.insert(0, LocalDateTime.now().toLocalDate() + ": ");
            System.out.println(sb);
        };

        str.accept("I want to log this statement");

        //predicate - boolean expression
        Predicate<String> aWords = p -> p.indexOf("A") == 0;
        ArrayList<String> a = new ArrayList<>(Arrays.asList(dictionary));
        a.removeIf(aWords);

        String apple = "Apple";
        if(aWords.test(apple)){
            System.out.println(apple + " starts with an A");
        }

        //no intake/parameter, returns an object;
        Supplier<String> stringSupplier = () -> new String("returning new String object");
        System.out.println("stringSupplier.get() = " + stringSupplier.get());

        //takes a parameter and returns a value
        Function<String, String> funkyFunction = (s) -> {
            s = s.repeat(5);
            return s;
        };
        System.out.println("funkyFunction.apply() = " + funkyFunction.apply("oh no"));




    }
}
