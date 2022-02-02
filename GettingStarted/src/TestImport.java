
//single type import declaration
//import garden.vegetable.VineVegetable;
import garden.vegetable.*;

public class TestImport {
    public static void main(String[] args) {
        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args);
    }
}

class VineVegetable{
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}
