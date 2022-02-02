package a;

public class Number {

        Number number;
        java.lang.Number number1;

        Number(java.lang.Number number){
            this.number1 = number;
            System.out.println("Constructor for java.lang.Number");
        }

        Number(Number number){
            this.number = number;
            System.out.println("Constructor for a.Number");
        }

    public static void main(String[] args) {
        Number n = new Number(10);
        Number n2 = new Number(n);
    }


}
