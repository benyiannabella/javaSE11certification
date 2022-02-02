import java.io.*;

public class FileReaders {

    public static void main(String[] args) throws Exception {
//        File file = new File("abc.txt");
//        if(!file.exists()) file.createNewFile();

//        FileReader fr = new FileReader(file);
//        int i = fr.read();
//        while(i != -1){
//            System.out.print((char)i);
//            i=fr.read();
//        }
//        System.out.println("");
//        System.out.println("__________________");
//
//        FileReader fr2 = new FileReader(file);
//        char[] array = new char[(int)file.length()];
//        fr2.read(array);
//        for(char c : array){
//            System.out.print(c);
//        }

//        FileWriter fw = new FileWriter(file, true);
//        fw.write("\nbye\ngoodbye");
//        fw.flush();

        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        copyFile(file1, file2);


    }

    public static void copyFile(File file1, File file2) throws
            Exception {
        var reader = new InputStreamReader(
                new FileInputStream(file1));
        try (var writer = new FileWriter(file2)) {
            char[] buffer = new char[10];
            while(reader.read(buffer) != -1) {
                writer.write(buffer);// n1
            }
        }
    }
}
