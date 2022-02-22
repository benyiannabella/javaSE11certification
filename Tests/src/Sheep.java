public class Sheep {
     void baa() {
        System.out.println("baa!");
    }
//    default void speak() {
//        baa();
//    }
}

class Sounds {
    public static void main(String[] args) {
        var sheep = new Sheep();
//        sheep.speak();
    }
}