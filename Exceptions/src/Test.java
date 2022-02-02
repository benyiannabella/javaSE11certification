class MyException1 extends RuntimeException {
    public void text() {
        System.out.println("Logging MyException");
    }
}

class YourException extends RuntimeException {
    public void text() {
        System.out.println("Logging YourException");
    }
}

public class Test {
    public static void main(String[] args) {
        try {
            throw new MyException1();
        } catch(MyException1 | YourException ex){
            ex.text();
        }
    }
}