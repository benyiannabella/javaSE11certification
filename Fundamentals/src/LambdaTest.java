import java.util.function.Predicate;

public class LambdaTest {
    private int age = 11;

    public static void main(String[] args) {
        int age = 10;
        laugh(new LambdaTest(), var -> var.age > 10);

    }

    public static void laugh(LambdaTest l, Predicate<LambdaTest>testL){
        var check = testL.test(l) ? "hahaha" : "silence";
        System.out.println(check);

    }
}
