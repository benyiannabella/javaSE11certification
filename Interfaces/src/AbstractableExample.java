interface Abstractable {
    void makeConcrete();
}

abstract class AbstractClass implements Abstractable {
    abstract void callConcrete();
}


public class AbstractableExample extends AbstractClass {

    public static void main(String[] args) {
        AbstractableExample abstractableExample = new AbstractableExample();
        abstractableExample.callConcrete();

    }

    @Override
    public void makeConcrete() {
        System.out.println("Method declared in Abstractable interface");
    }

    @Override
    void callConcrete() {
        System.out.println("method declared in AbstractClass");
        makeConcrete();
    }
}

