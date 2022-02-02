import java.io.*;
import java.nio.Buffer;

public class Combine {

    public static void readAndWrite(File file, File file1) throws IOException {
        try (FileWriter fw = new FileWriter(file, true);
             PrintWriter pw = new PrintWriter(fw);
             FileReader fr = new FileReader(file1);
             BufferedReader br = new BufferedReader(fr)) {
            String str = br.readLine();
            while (str != null) {
                pw.println(str);
                str = br.readLine();
            }
        }
    }

    public static void copy(File file, File file1) throws IOException{
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter pw = new BufferedWriter(fw))
            {

             }
    }

    public static void writeFile(String[] sa, File file) throws IOException {
        try (FileWriter fw = new FileWriter(file);
             BufferedWriter bf = new BufferedWriter(fw);) {
            String[] s = sa;
            for (String s1 : s) {
                System.out.println(s1);
                bf.write(s1);
                bf.newLine();
            }
        }
    }


    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");
        String[] s = new String[]{"hello", "bye"};
        String[] s1 = new String[]{"hi", "adios"};
        writeFile(s, file1);
        System.out.printf("First file written");
        System.out.println("");
        writeFile(s1, file2);
        System.out.println("second file written");
        readAndWrite(file3, file1);
        readAndWrite(file3, file2);
        System.out.println("Third file written");

    }

}
