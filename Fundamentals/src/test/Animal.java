package test;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Animal {
    private boolean canJump;
    private boolean canSwim;
    private boolean canFly;
    private String name;

    public Animal(boolean canJump, boolean canSwim, boolean canFly, String name) {
        this.name = name;
        this.canJump = canJump;
        this.canSwim = canSwim;
        this.canFly = canFly;
    }

    public boolean isCanJump() {
        return canJump;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public boolean isCanFly() {
        return canFly;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void print(ArrayList<Animal> list, Predicate<Animal>check){
        for(Animal a : list){
            if(check.test(a)) System.out.print(a + ", ");
        }
    }

    public static void main(String[] args) {
        Animal frog = new Animal(true, true, false, "frog");
        Animal bird = new Animal(true, false, true, "bird");
        Animal dog = new Animal(true, true, false, "dog");

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(frog);
        animalList.add(bird);
        animalList.add(dog);

        print(animalList, a-> a.canFly);
//        print(animalList, a-> a.canJump);
//        print(animalList, a-> a.canSwim);
    }
}
