import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyExample {
    public static void main(String[] args) {

        FinallyExample f = new FinallyExample();

        try {
            System.out.println("Outer try starts here...");
            String property = f.getPropertyFromFile("FinallyProperties.txt");
        } catch (IOException | ArrayIndexOutOfBoundsException ioe) {
            System.out.println("Outer catch block starts here ...");
            try{
                System.out.println("Inner try attempts retry....");
                String line = f.getPropertyFromFile("AnotherProperties.txt");
            } catch(IOException | ArrayIndexOutOfBoundsException io){
                System.out.println("Inner catch starts here...");
            }
        }
    }

    public String getPropertyFromFile(String filename) throws IOException{

        String property;
        BufferedReader br = new BufferedReader(new FileReader(filename));
        try{
            String line = br.readLine();
            property = line.split("\\s")[2];
            System.out.println("Property value = " + property);
        } finally {
            if (br!=null) br.close();
            System.out.println("Close buffer reader");
        }
        return property;
    }
}
