class Animal{
    public  void printAnimal(){
        System.out.println("I am an animal!");
    }
}

class Dog extends Animal{
    public void printDog(){
        System.out.println("I am a dog!");
    }

    public String getDogString(){
        return "dog";
    }
}

class Cat extends Animal{
    public void printCat(){
        System.out.println("I am a Cat!");
    }
}

public class DowncastExamples {

    public static void main(String[] args) {

        DowncastExamples dex = new DowncastExamples();
        Animal a = new Animal();
        Dog d =(Dog) a;


        //before casting
//        Animal genericDog = new Dog();
//        Animal genericCat = new Cat();
//
//        Dog specificDog = new Dog();
//        Cat specificCat = new Cat();
//
//        dex.testDog(specificDog);
//        dex.testCat(specificCat);
//
//        dex.testAnimal(specificDog);
//        dex.testAnimal(specificCat);
//        dex.testAnimal(genericDog);
//        dex.testAnimal(genericCat);

        //dog and cat objects with Animal reference;
        Animal genericDog = new Dog();
        Animal genericCat = new Cat();

        //we cast
        dex.testDog((Dog) genericDog);
        dex.testCat((Cat) genericCat);

        dex.testAnimal((Dog) genericDog);
        dex.testAnimal((Cat) genericCat);

        // example of wrong casting - class cast exception
//        dex.testDog((Dog) genericCat);
//        dex.testCat((Cat) genericDog);
//
//        dex.testAnimal((Dog) genericCat);
//        dex.testAnimal((Cat) genericDog);


        dex.testAnimal(genericDog);
        dex.testAnimal(genericCat);

        //downcasting used in expression
        if(((Dog) genericDog).getDogString().equals("dog")){
            System.out.println("Match");
        }

        //downcast a method return type
        Cat c = (Cat) dex.passThrough(genericCat);
        c.printCat();

    }

    public void testAnimal(Animal animal){
        System.out.println("Executing testAnimal with Animal type");
        animal.printAnimal();
    }
    public void testAnimal(Dog dog){
        System.out.println("Executing testAnimal with Dog type");
        dog.printDog();
    }
    public void testAnimal(Cat cat){
        System.out.println("Executing testAnimal with Cat type");
        cat.printCat();
    }
    public void testDog(Dog dog){
        dog.printDog();
    }

    public void testCat(Cat cat){
        cat.printCat();
    }

    public Object passThrough(Object o){
        return o;
    }
}
