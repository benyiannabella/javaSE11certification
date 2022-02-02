import java.util.ArrayList;
import java.util.List;

public class Boxing {
    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(5);
        i.add(50);
        System.out.println(i);
        i.remove(Integer.valueOf(5));
        System.out.println(i);
    }
}
