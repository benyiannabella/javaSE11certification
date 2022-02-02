public class Test2 {

    public static void main(String[] args) {

        String test = "FredGeorgeBoysHelloHowAreYouNiceToMeatYou";

        String shorG = String.valueOf(test.toCharArray(), 4, 6);
        System.out.println(shorG);
        String sG = test.substring(4,10);
        System.out.println(sG);
        System.out.println(test);

        System.out.println(test.length());
        StringBuilder sb = new StringBuilder(5);
        StringBuilder sb2 = new StringBuilder("FredGeorgeBoysHelloHowAreYouNiceToMeatYou");
//        sb.append(test);
        System.out.println(sb==sb2);
        System.out.println(sb.equals(sb2));
        System.out.println(sb.toString().equals(sb2.toString()));
        System.out.println(sb.toString()==(sb2.toString()));
        System.out.println(sb.compareTo(sb2));

        sb.append("FredGeorgeBoysHelloHowAreYouNiceToMeatYou");
//                .append(new char[]{'A','L','F','A'})
//                        .insert(sb.length(),204.0F);
        System.out.println(sb);
        char[] myChar = new char[5];
        sb.getChars(0,4,myChar,0);
        System.out.println(myChar);

        String str = new String(myChar);
        System.out.println(str);
//


    }
}
