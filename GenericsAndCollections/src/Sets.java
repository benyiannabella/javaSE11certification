import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        System.out.println(s.add(10));
        System.out.println(s.add(10));
        System.out.println(s);
        System.out.println(s.remove(10));
        System.out.println(s.isEmpty());
    }
}
