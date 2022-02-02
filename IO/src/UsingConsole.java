import java.io.Console;
import java.util.Arrays;

public class UsingConsole {
    public static void main(String[] args) {

        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            String name = console.readLine("Please enter your name: ");
            console.writer().format("Hi %s", name);
            console.writer().println();
            console.format("What is your address?");
            String address = console.readLine();
            char[] password = console.readPassword("Enter your password " + "between %d and %d characters: ", 5, 10);
            char[] retype = console.readPassword("Enter password again: ");
            console.writer().println(Arrays.equals(password, retype) ? "Passwords match" : "Passwords do not match!");
        }

    }
}
