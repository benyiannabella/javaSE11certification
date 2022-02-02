import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args) {

        Supplier<LocalDateTime> s = ()->LocalDateTime.now();
        LocalDateTime lt = s.get();
        System.out.println(lt);

        Supplier<LocalDateTime> s1 = LocalDateTime :: now;
        LocalDateTime l = s1.get();
        System.out.println(l);


        Supplier<String> s2 = ()-> new String("Hello");
        Supplier<String> s3 = String :: new;
        System.out.println(s2.get());
        System.out.println(s3.get().toString());
    }
}
