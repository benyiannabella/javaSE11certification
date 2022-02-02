class GlobalInformation{
    public static int DogCount;
    public static int CatCount;
    public static int TreeCount;
}

abstract class CounterClass{
    public abstract void countMyInstances();
}

abstract class Animal extends CounterClass{

    private String name;
    private String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class Dog extends Animal{
    public Dog(String name, String type) {
        super(name, type);
        countMyInstances();
    }

    @Override
    public void countMyInstances() {
        GlobalInformation.DogCount++;
    }
}

class Cat extends Animal{
    public Cat(String name, String type) {
        super(name, type);
        countMyInstances();
    }

    @Override
    public void countMyInstances() {
        GlobalInformation.CatCount++;
    }
}

class Tree extends CounterClass{
    public Tree() {
        countMyInstances();
    }

    @Override
    public void countMyInstances() {
        GlobalInformation.TreeCount++;
    }
}


public class CompareExamples {
    public static void main(String[] args) {

        Dog d;
        Cat c;
        Tree t;

        for(int i = 0; i <5; i++){
            d = new Dog("DOG_" + (i + 1), "dog");
        }
        for(int i = 0; i <7; i++){
            c = new Cat("CAT_" + (i + 1), "cat");
        }
        for(int i = 0; i <3; i++){
            t = new Tree();
        }

        System.out.println("Number of Cat instances = " + GlobalInformation.CatCount);
        System.out.println("Number of Dog instances = " + GlobalInformation.DogCount);
        System.out.println("Number of Tree instances = " + GlobalInformation.TreeCount);

    }

}
