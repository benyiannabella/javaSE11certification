import java.util.ArrayList;
import java.util.Arrays;

public class ForEachExample {

    public static String setValue(int index){
        int intA = 65;
        int multiplier = index / 26;
        int cntr = index - (multiplier * 26);
        return (char) (cntr + intA) + "_TEST_" + (index + 1);
    }

    public static void main(String[] args) {
        String[] strings = new String[50];

        Arrays.setAll(strings, ForEachExample :: setValue);
//        Arrays.setAll(strings, s -> setValue(s));

        ArrayList<String> aList = new ArrayList<>(Arrays.asList(strings));
        System.out.println(aList + "\n");

        aList.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("B"))
                .forEach(System.out :: println);

        aList.sort((a,b) -> {
            return Integer.valueOf(b.split("_")[2]).compareTo(
                    Integer.valueOf(a.split("_")[2]));
        });

        aList.sort((a,b) -> b.compareTo(a));
        System.out.println("\n" + aList);
    }

}
