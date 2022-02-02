import java.util.function.Predicate;

public class Reference {
    public boolean check(String s, Predicate<String> p) {
        return p.test(s);
    }

    public boolean impl(String s) {
        var str = "hello";
        Predicate<String> p = str::startsWith;
        return check(s, p);
    }

    public static void main(String[] args) {
        String s = "g";
        Reference reference = new Reference();
        System.out.println(reference.impl(s));

    }
}
