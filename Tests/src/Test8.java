abstract class Animal {
    private String name;
//
//    Animal(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private String breed;


    Dog(String breed) {

        this.breed = breed;
    }

//    Dog(String name, String breed) {
//
//        this.breed = breed;
//    }

    public String getBreed() {
        return breed;
    }
}

class Cat extends Animal{

}

public class Test8 {
    public static void main(String[] args) {


        Animal dog1 = null;
        Dog dog2 = (Dog)dog1;
        Cat cat = (Cat)dog1;

        System.out.println();
//        System.out.println(dog1.getName() + ":" + dog1.getBreed() + ":" +
//                dog2.getName() + ":" + dog2.getBreed());
    }
}