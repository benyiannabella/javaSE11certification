class Pet {
    public void getPet(){
        System.out.println("I am a pet");
    }
}

public class Mouse extends Pet {
    public void getMouse() {
        System.out.println("I am a mouse");
    }

    public void getPet() {
        System.out.println("I am a pet in mouse class");
    }

    public static void main(String[] args) {
        Pet m = new Mouse();
        m.getPet();
        Pet p = new Pet();
        p.getPet();
        Mouse mouse = new Mouse();
        mouse.getMouse();
        mouse.getPet();
    }
}
