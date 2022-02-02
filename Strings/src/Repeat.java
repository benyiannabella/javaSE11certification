public class Repeat {

    public static void main(String[] args) {


        String testRepeat = " String ";
        System.out.println(testRepeat.repeat(3));
        System.out.println("repeat with 0 - " + testRepeat.repeat(0));

        String noSpace = testRepeat.strip();
        System.out.println(noSpace);
        System.out.println(testRepeat);
    }
}
