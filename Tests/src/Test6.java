
public class Test6 {
    Integer i = 10; //Line n1
    Test6(){
        System.out.println("constructor" + i);
    }
    {
        Integer i = 2; //Line n2
        System.out.println("init1 " + i);
        System.out.println("init1 " + this.i);
    }
    public static void main(String[] args) {
        System.out.println(new Test6().i); //Line n3
    }
    { i--;
        System.out.println("init2 " + i);
        System.out.println("init2 " + this.i);} //Line n4
}