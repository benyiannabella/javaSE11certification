import java.util.Arrays;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        String[] colors = {"blue", "red", "yellow"};
        List colorList = Arrays.asList(colors);
        System.out.println(colorList);
        System.out.println(colorList.get(0).toString());
        colorList.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(colorList);
        colorList.set(0, "pink");
        System.out.println(colorList);

        List newList = List.of(colorList);
        System.out.println(newList);
        List newList2 = List.copyOf(colorList);
        System.out.println(newList2);

        List test = List.of(colorList);
        List newL = test.subList(0,1);
        System.out.println(test);
        System.out.println(newL.toString() + "!");





    }
}
