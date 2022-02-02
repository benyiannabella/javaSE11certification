public class StringConstructor {
    public static void main(String[] args) {

        int alphabetLen = 26;
        char[] alphabet = new char[alphabetLen];
        int[] integers = new int[alphabetLen];
        byte[] bytes = new byte[alphabetLen];
        int i = 0;

        for(char c = 'a'; c<='z'; c++, i++){
            alphabet[i] = c;
            integers[i] = (int)c;
            bytes[i]=(byte) c;
        }

        String charString = new String(alphabet);
        System.out.println("charString = " + charString);

        String byteString = new String(bytes);
        System.out.println("byteString = " + byteString);

        String intString = new String(integers, 0,alphabetLen);
        System.out.println("intString = " + intString);

        int offset = 1;
        String charString2 = new String(alphabet, offset, alphabetLen-offset);
        System.out.println("charString2 = " + charString2);

        int offset1 = 3;
        int length = 5;

        String byteString2 = new String(bytes, offset1, length);
        System.out.println("byteString2 = " + byteString2);
    }
}
