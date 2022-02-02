class Load {

    public void bestMethod(int i) {
        System.out.println("best method for int");
    }

    public void bestMethod(Integer i) {
        System.out.println("best method for Integer");
    }

    public void bestMethod(Number i) {
        System.out.println("best method for number");
    }

    public void bestMethod(Comparable i) {
        System.out.println("best method for comparable");
    }

    public void bestMethod(int... i) {
        System.out.println("best method for varagrgs int");
    }

    public void bestMethod(Integer... i) {
        System.out.println("best method for varargs Integer");
    }
}

public class IsOverloaded {
    public static void main(String[] args) {
        Load l = new Load();
        int myInt = 1;
        Integer myInteger = Integer.valueOf(myInt);
        l.bestMethod(myInt);
        l.bestMethod(myInteger);
        l.bestMethod((Number) myInt);
        l.bestMethod((Comparable) myInt);
        l.bestMethod(new int[]{1,2});
        l.bestMethod(new Integer[]{1,2});
    }
}

