class TestA {
    public int num = 2;

    public TestA(int num) {
        this.num = num;
    }

    
}

public class Test extends TestA{
    public int num = 4;

    public Test(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        TestA testA = new Test();
        System.out.println(testA.num);
    }

}