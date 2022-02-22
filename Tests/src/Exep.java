import java.beans.PropertyEditorManager;
import java.util.ArrayList;
import java.util.List;

public class Exep {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(3.6);
        list.add(4.5);
        list.add(2.0);

        list.remove(Double.valueOf(2));
        System.out.println(list);
    }
}
