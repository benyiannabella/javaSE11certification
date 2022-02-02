public class Replacement {

    public static void main(String[] args) {

        String myString = "testingReplacement";
        System.out.println(myString.substring(5));
        System.out.println(myString.subSequence(3,7));
//        myString=myString.replace('t', 'T');
//        System.out.println(myString);
//        String newMyString= myString.replaceAll("(e(s|t|i){3})", "ass");
        String newMyString = myString.replace("e", "e");
        System.out.println(newMyString);
        System.out.println(myString==newMyString);
    }
}
