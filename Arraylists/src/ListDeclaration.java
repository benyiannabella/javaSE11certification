import java.util.ArrayList;
import java.util.List;

public class ListDeclaration {

    public static void main(String[] args) {

        List l;
        List<Integer> intList;
        List<String> stringList;

        ArrayList a;
        ArrayList<Integer> integers;
        ArrayList<String> strings;

//        a = new ArrayList();
//
        strings = new ArrayList<String>();
        integers = new ArrayList<Integer>();
//
//        ArrayList<String> abc = new ArrayList<>();
//        ArrayList<String> def = new ArrayList();
//
//        l = a;
//        intList = integers;
//
        for(int i = 0; i < 5; i++){
            strings.add("String_" + (i+1));
            integers.add(i + 1);
        }
        System.out.println(strings);
        System.out.println(integers);

        for(int i = 0; i < 5; i++){
            strings.add(1, "String_" + (i+1));
            integers.add(1, i+1);
        }
        System.out.println(strings);
        System.out.println(integers);

        integers.addAll(List.of(15,25,35));
        System.out.println(integers);

        integers.addAll(1, List.of(150, 250, 350));
        System.out.println(integers);

        strings.remove("String_5");
        System.out.println("Strings arraylist after removing String_5: " + strings.toString());

        strings.removeIf(s -> s.contains("_2"));
        System.out.println(strings);

        strings.replaceAll(s -> s.replace("String_", "Test_"));
        System.out.println(strings);

        strings.replaceAll(s -> s.replace("Test_", "String_"));

        strings.removeAll(List.of("String_1", "String_2", "String_3"));
        System.out.println(strings);

        strings.retainAll(List.of("String_4"));
        System.out.println(strings);

        strings.forEach(System.out :: println);

        strings.set(1, "ABC");
        System.out.println(strings);
        strings.set(strings.size()-1,"123");
        System.out.println(strings);

        ArrayList<String> blist = new ArrayList<>(List.of("A", "B", "C", "D"));  // Line 1
        String[] bArray = blist.toArray(new String[5]);   // Line 2
        
    }
}
