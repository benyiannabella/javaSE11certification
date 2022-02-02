import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> i = List.of(1,2,3,4,5);
        getString(i);

    }

    public static String getString(List<Integer> list) {
      String s = list.stream()
                .map(x-> ((x%2)==0 ? "e" : "o") + x)
                .collect(Collectors.joining(","));
        System.out.println(s);
      return s;
    }
}
