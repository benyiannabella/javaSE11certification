interface Teachable{

    default void getInterfaceName(){
        System.out.println("my name is teachable");
    }

    static void myStatic(){
        System.out.println("I am an interface static method");
    }

   void teach();
}

interface Trainable {

    default void getInterfaceName() {
        System.out.println("my name is trainable");
    }
}

class Teaching {
    public void teachingClass(){
        System.out.println("I am a teaching class");
    }
}

class MathTeaching extends Teaching implements Teachable, Trainable{

    public void getInterfaceName(){
        System.out.println("my name is mathTeaching");
    }

    @Override
    public void teach() {
        System.out.println("I am teaching math with interface");
    }

//    public void teachingClass(){
//        System.out.println("I am teaching math with parent class method");
//    }
}

public class TestInterface {

    public static void main(String[] args) {

        Teachable.myStatic();
        Teachable teachable = new MathTeaching();
        Teaching teaching = new MathTeaching();
        MathTeaching mathTeaching = new MathTeaching();

        System.out.println("interface");
        teachable.getInterfaceName();
        teachable.teach();
        System.out.println("class");
        teaching.teachingClass();
        System.out.println("child claass");
        mathTeaching.getInterfaceName();
        mathTeaching.teachingClass();
        mathTeaching.teach();
    }


}
