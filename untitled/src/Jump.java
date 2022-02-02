
public class Jump {
    private int rope = 1;
    protected boolean outside;

    public Jump() {
        this(4);
        outside = true;
        System.out.println("no arg constructor called");
    }
    public Jump(int rope) {
        System.out.println("parameterized constructor called");
        this.rope = outside ? rope : rope+1;
    }
    public static void main(String[] bounce) {
        System.out.print(new Jump().rope);
    }
}