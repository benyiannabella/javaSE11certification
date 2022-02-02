import java.io.FileNotFoundException;
import java.io.IOException;

class BaseClass{

    public void goodMethod() {
        System.out.println("BaseClass executing good method");
    }

    public void printInformation(CharSequence s){
        System.out.println("BaseClass prints " + s);
    }

    public CharSequence getInformation(){
        return getClass().getName();
    }
}

class ExtendedClass extends BaseClass{

    //override
    public void goodMethod() {
        super.goodMethod();
        System.out.println("ExtendedClass executing good method");
    }

    //overload
//    public void printInformation(String s){
//        System.out.println("ExtendedClass prints " + s);
//    }

    //overridden
    public void printInformation(CharSequence s){
        System.out.println("ExtendedClass prints " + s);
    }

    //overload
    public String getInformation(){
        return getClass().getName();
    }
}
public class OverrideExample {
    public static void main(String[] args) {
        ExtendedClass e = new ExtendedClass();
        e.goodMethod();
        e.printInformation(e.getInformation());
        e.printInformation((CharSequence) e.getInformation());
    }

}
