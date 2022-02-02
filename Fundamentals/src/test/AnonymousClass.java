package test;

public abstract class AnonymousClass {

    //    interface Calculable{
//        int calculate(int a, int b);
//    }
    abstract int calculate();
    public int admission (int i, AnonymousClass ac){
        return i + ac.calculate();
    }

    public int pay() {
        return admission(5, new AnonymousClass() {
            public int calculate() {
                return 3;
            }
        });
     }

    public static void main(String[] args) {
//        Calculable ac = new Calculable(){
        AnonymousClass ac = new AnonymousClass() {
            public int calculate() {
                return 10;
            }
        };
        System.out.println(ac.calculate());
    }
}
