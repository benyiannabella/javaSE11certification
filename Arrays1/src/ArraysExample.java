import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {

        Integer[] integerArray = new Integer[5];
        int intArray[] = new int[5];

        System.out.println("integerArray = " + Arrays.toString(integerArray));
        System.out.println("intArray = " + Arrays.toString(intArray));

        for(int i = 0; i < 5; i++){
            intArray[i] = i+1;
            integerArray[i] = i+1;
        }
        System.out.println("integerArray = " + Arrays.toString(integerArray));
        System.out.println("intArray = " + Arrays.toString(intArray));

        integerArray[0] = 10;
        intArray[4] = 100;
        System.out.println("integerArray = " + Arrays.toString(integerArray));
        System.out.println("intArray = " + Arrays.toString(intArray));

        int[] intArray2 = intArray;
        Integer[] integerArray2 = integerArray;

        System.out.println("integerArray = " + Arrays.toString(integerArray));
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("integerArray = " + Arrays.toString(integerArray2));
        System.out.println("intArray = " + Arrays.toString(intArray2));

        integerArray[0] = 55;
        intArray[0] = 66;

        integerArray2[1] = 77;
        intArray2[1] = 88;
        System.out.println("integerArray = " + Arrays.toString(integerArray));
        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("integerArray = " + Arrays.toString(integerArray2));
        System.out.println("intArray = " + Arrays.toString(intArray2));
    }
}
