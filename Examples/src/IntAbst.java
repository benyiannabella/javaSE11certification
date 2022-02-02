interface Int{
     void move();
}

class Animal1 {
    String Animal;
    public static void move(){
        System.out.println("move");
    }
}

//class Dog extends Animal implements Int{
//
//}

public class IntAbst {
    public static void main(String[] args) {
//        Int i = new Dog();
//        i.move();
//        Animal a = new Dog();
//        a.move();

        Int[] ints = new Int[2];
        for(Int i : ints){
            i.move();
        }

    }

}
