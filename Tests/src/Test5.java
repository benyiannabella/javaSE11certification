public class Test5 {
    static int i1 = 10;
    int i2 = 20;

    int add() {
        return this.i1 + this.i2; //Line n1
    }

    public static void main(String[] args) {

//        System.out.println(new Test5().add()); //Line n2
        boolean flag = false;
        do {
            if (flag = !flag) { //Line n1
                System.out.print(1); //Line n2
                continue; //Line n3
            }
            System.out.print(2); //Line n4
        } while (flag); //Line n5
    }
}
