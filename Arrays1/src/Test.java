import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = s1;
        String s3 = new String("hello");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println("----------Arrays----------");

//        String[] sa1 = {"adio", "bye", "hello", "hi"};
//        String[] saNew = {"bye", "hi", "hello","bye","adio"};
//        String[] saDuplicate = {"adio", "bye", "hello", "hi", "bye"};

        System.out.println("----------alter data -----------");
        int[] myInt = new int[5];
        int[] myInt1 = new int[5];
        int[] myInt2 = new int[5];
        Integer[] myInt3 = {2, 5, 1, 3, 4};

        System.out.println(Arrays.toString(myInt));
        Arrays.fill(myInt,5);
        System.out.println(Arrays.toString(myInt));
        Arrays.fill(myInt1,0,2,10);
        System.out.println(Arrays.toString(myInt1));
        Arrays.setAll(myInt2, index -> index+1);
        System.out.println(Arrays.toString(myInt2));
        Arrays.sort(myInt3, Collections.reverseOrder());
        System.out.println(Arrays.toString(myInt3));

//        System.out.println("___________Binary Search__________");
//        String keyWord = "hi";
//        System.out.println(Arrays.binarySearch(sa1,keyWord));
//        System.out.println(Arrays.binarySearch(saNew,keyWord));
//        System.out.println(Arrays.binarySearch(saDuplicate,keyWord));
//
//



//        String[] sa2 = sa1;
//
//
//        List<String> sa3 =Arrays.asList(sa1);
//        String[] sa4 = {"hello","hi"};
//        String[] sa5 = null;
//        String[] sa6 = {"hi", "hello","night"};
//
//        System.out.println(sa1 == sa2);
//        System.out.println(sa1.toString());
//        System.out.println(sa2.toString());
//        System.out.println(sa3.toString());
//
//        System.out.println(sa1.equals(sa2));
//        System.out.println(sa1.equals(sa3));
//
//        System.out.println("_________Arrays.equals___________");
//        System.out.println(Arrays.equals(sa1,sa2));
//        System.out.println(Arrays.equals(sa1,sa4));
//
//        String str1 = "b";
//        String str2 = "n";

//        System.out.println("-----------Compare------------");
//        System.out.println(Arrays.compare(sa1,sa2));
//        System.out.println(Arrays.compare(sa1,sa4));
//        System.out.println(Arrays.compare(sa1,sa5));
//        System.out.println(Arrays.compare(sa4,sa5));
//        System.out.println(Arrays.compare(sa1,sa6));
//        System.out.println(str1.compareTo(str2));


    }
}
