import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;

public class Test {
    static String s;

    public static void main(String[] args) {

//        String test = "newtest";
//        String word = "test";
//        int lastIndex = test.lastIndexOf(word);
//        System.out.println(lastIndex);
//        int lastIndex2 = test.lastIndexOf(word,5);
//        System.out.println(lastIndex2);
//
//        boolean matches = test.regionMatches(4, "test", 1, 3);
//        System.out.println(matches);

        String[] joinText = {"Hello", "World", "Hi", "You!"};
        ArrayList<String> strings = new ArrayList<>(Arrays.asList(joinText));
        String concatText="";
//        for(String text : joinText){
//            concatText+= text;
//        }
//        System.out.println(concatText);
//        concatText = String.join(" ", joinText);
//                System.out.println(concatText);
        concatText = String.join(" ", strings);
                System.out.println(concatText);

        StringJoiner s = new StringJoiner(" ");
        for(String s1 : joinText){
            s.add(s1);
        }
        System.out.println(s);

        String[] splitTest = concatText.split(" ");
        System.out.println(Arrays.toString(splitTest));

    }
}
