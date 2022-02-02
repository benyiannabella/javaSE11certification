import java.util.Random;
import java.util.function.Supplier;

public class Randomize {

    public static void main(String[] args) {
        var random = new Random();
        Supplier<Integer> i = random :: nextInt;
        Supplier<Integer> l = ()->random.nextInt();

    }
}
