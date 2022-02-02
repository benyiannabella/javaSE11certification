public class Test7 {





    class Sub extends Test7{
        int j;
        Sub(int i, int j){
            super();
            this.j = j;
            System.out.println("no arg const child");
        }
    }

    static String name;

    public static void main(String[] args) {

        System.out.println(name);
    }
}
