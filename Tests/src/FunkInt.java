import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunkInt {

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(100);
            list.add(7);
            list.add(50);
            list.add(17);
            list.add(10);
            list.add(5);

            list.removeIf(a -> a % 10 == 0);

            System.out.println(list);
        }
    }
