class MyCustomException extends Exception{
    MyCustomException(String message){
        super(message);
    }
}

class MyDivisionByZeroException extends Exception{
    MyDivisionByZeroException(String message){
        super(message);
//        super.printStackTrace();
    }
}

public class MyException {

    public static void main(String[] args) {
        MyException myException = new MyException();
        myException.throwError("Field is mandatory, please do not leave a null value!");

        try {
            throwingException(5, 0);
        } catch (MyDivisionByZeroException e){
            System.out.println("The divisors must not be zero!");
        }

        int i = 0;
        try {
            System.out.println("i =" + 10 / i++);
        } catch (RuntimeException e) {

        } finally {
            System.out.println("i = " + i);
        }

        System.out.println();
    }

    public void throwError(String message){

        try {
            throw new MyCustomException(message);
        }
        catch(MyCustomException ce){
            System.out.println(message);
        }
        catch (Exception e){
            System.out.println("Exception occurred!");
        }

    }

    public static void throwingException(int a, int b) throws MyDivisionByZeroException{
        String message = "The divisors must not be zero!";
        if(a == 0 || b == 0)
            throw new MyDivisionByZeroException(message);
    }
}
