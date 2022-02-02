import java.io.*;
import java.nio.Buffer;
import java.util.Locale;

public class ReadClass {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Programming\\java SE11 certification\\IO\\io.txt");
//        try {
//            if (!file.exists()) System.out.println("File created - " + file.createNewFile());
//            System.out.println(file.exists());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        BufferedWriter bWriter = new BufferedWriter(new FileWriter(file));
        try(bWriter){
            String[] s = {"hello", "bye", "goodbye"};
            for(String word : s) {
                bWriter.write(word.toUpperCase());
                bWriter.newLine();
            }
        }

        var bReader = new BufferedReader(new FileReader(file));
        String[] s = new String[3];
        int i = 0;
        try(bReader){
            String s1;
           while ((s1 = bReader.readLine() )!= null){
               s[i] = s1.toLowerCase();
               i++;
           }

            s1 = String.join(", ", s);
            System.out.println("Read file: " + s1);
        }

//        var bReader = new BufferedReader(new FileReader(file));
//        try(bReader){
//            System.out.println("Before mark " + (char)bReader.read());
//            if(bReader.markSupported()) {
//            bReader.mark(100);
//            System.out.println("With mark " + (char)bReader.read());
//            System.out.println("With mark " + (char)bReader.read());
//            bReader.reset();}
//            bReader.skip(3);
//            System.out.println("After mark " + (char) bReader.read());
//        }
    }
}
