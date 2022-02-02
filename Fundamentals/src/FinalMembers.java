public class FinalMembers {
    public static void main(String[] args) {
        final String myString= new String("hello");
        String s = myString.concat(" world");
//        myString = s;
        s = myString;

        final StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        s = sb.substring(0);
        System.out.println(s);
    }
}
