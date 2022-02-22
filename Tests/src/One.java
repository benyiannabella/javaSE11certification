import java.util.Objects;

public class One {
//    static int a = 10000;
//    static {
//        a = -a--;
//    }
//
//
//    {
//        a = -a++;
//    }

    Integer i = 10; //Line n1

    {
        Integer i = 2; //Line n2
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        One one = (One) o;
        return Objects.equals(i, one.i);
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }

    public static void main(String[] args) {
        System.out.println(new One().i); //Line n3
    }

    {
        i--;
    } //Line n4
}
