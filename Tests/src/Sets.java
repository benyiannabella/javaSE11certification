import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> set = Set.of("A", "B");
        Set<String> set3 = new HashSet<>(set);
        var set2 = Set.copyOf(set);
        System.out.println(set.hashCode() + ", " + set2.hashCode());
        System.out.println(set.hashCode() + ", " + set3.hashCode());
    }
}
