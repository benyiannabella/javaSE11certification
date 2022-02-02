import java.util.List;

public class Pipelines {
    public static void main(String[] args) {

        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        list.stream().
                filter(x-> x.length() == 4)
                .sorted().limit(2)
                .forEach(System.out :: println);
    }
}
