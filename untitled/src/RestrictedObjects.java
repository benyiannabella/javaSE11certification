class OnlyClass {

    //instance var
    private int classVariable;

    //private constructor - singleton pattern
    private OnlyClass() {
    }

    //instances can be created only inside the class because constructor is private;
    //o inside nested class
    private static final OnlyClass instance = new OnlyClass();

    //method to return the only instance
    public static OnlyClass getInstance() {
        return instance;
    }

    public static void doSomething() {
        instance.doSomethingRestricted();
    }

    private void doSomethingRestricted(){
        this.classVariable++;
        System.out.println("only one instance of the class exists");
    }

}

public class RestrictedObjects {
    public static void main(String[] args) {
        OnlyClass.doSomething();
    }
}

//cannot be extended
//class MyOnlyClass extends OnlyClass {}