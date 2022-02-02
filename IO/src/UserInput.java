import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {

    private static void userInput() throws IOException {
        var bi = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your age!");
        String s = bi.readLine();
        System.out.println("Thank you. Your age is: " + s);
    }

    public static void readConsole(){
        Console c = System.console();
        if(c!=null){
            String s= c.readLine();
            c.writer().println("You entered: " + s);
        } else {
            System.err.println("Console not available");
        }
    }

    public static void main(String[] args) throws IOException {
//        userInput();
        readConsole();
    }
}
