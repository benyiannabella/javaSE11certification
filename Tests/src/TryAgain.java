import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryAgain {
    public void tryAgain(String s) {

        try (FileReader r = new FileReader("")){
            System.out.println("X");
            throw new IllegalArgumentException();
        }catch(Exception e){
            System.out.print("A");
            try {
                throw new IOException();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }finally{
            System.out.print("O");
        }
    }
}