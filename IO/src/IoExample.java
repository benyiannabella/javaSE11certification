import java.io.File;
import java.io.IOException;

public class IoExample {
    public static void main(String[] args) throws IOException {

//        File f = new File("D:\\Programming\\java SE11 certification\\IO\\ioTest.txt");
//        System.out.println(f.exists());
//        if(!f.exists()) f.createNewFile();
        File f1 = new File("D:\\Programming\\java SE11 certification\\IO\\io.txt");
        System.out.println(f1.createNewFile());
//        System.out.println(f1.exists());
        var f2 = new File("D:\\Programming\\java SE11 certification\\IO\\ioT.txt");
        System.out.println(f1.renameTo(f2));
        System.out.println(f2.getName());
//        System.out.println(f1.getAbsolutePath());


//        File myFile = new File("D:\\Programming\\java SE11 certification\\IO\\iotext.txt");
//        if(myFile.exists()){
//            System.out.println("File exists: " + myFile.exists());
//            System.out.println("Absolute path: " + myFile.getAbsolutePath());
//            System.out.println("Is Directory: " + myFile.isDirectory());
//            System.out.println("Parent: " + myFile.getParent());
//            if(myFile.isFile()){
//                System.out.println("Length: " + myFile.length());
//                System.out.println("Modified: " + myFile.lastModified());
//            } else {
//                for(File subFile : myFile.listFiles()){
//                    System.out.println("Sub file name: " + subFile.getName());
//                }
//            }
//        }

    }

}