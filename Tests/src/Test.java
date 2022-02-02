import java.time.LocalDateTime;

abstract class Greetings {
    abstract void greet();
}

public class Test {
    public static void main(String[] args) {
        do {
            System.out.print(100);
        } while (false); //Line n1
        System.out.println("hello");
    }
}