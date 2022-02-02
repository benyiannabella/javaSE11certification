import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class DoubleParam {
    public boolean check(String a, String b, BiPredicate<String, String> bp){
        return bp.test(a,b);
    }

    public boolean impl(String a, String b){
        BiPredicate<String, String> bp = String :: startsWith;
        return check(a,b, bp);
    }


    public static void main(String[] args) {
        DoubleParam dp = new DoubleParam();
        System.out.println(dp.impl("nice", "ni"));

        Supplier<ArrayList<String>> sl = ArrayList::new;
        ArrayList<String> list = sl.get();
        list.add("test");
        System.out.println(list);
    }
}
