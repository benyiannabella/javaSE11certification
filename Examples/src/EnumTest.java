enum Flags {
    TRUE("true"), FALSE("false"), ELSE("else");

    private String truth;
    Flags(String truth){
        this.truth = truth;
    }

    public String getTruth() {
        return truth;
    }
}

public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Flags.FALSE.getTruth().toUpperCase());
        Flags f = Flags.TRUE;
//        Flags f2 = f.clone();

        System.out.println(new RuntimeException("hello"));
        System.out.println(new RuntimeException());
        System.out.println(new RuntimeException(new RuntimeException("hello")));
    }

}
