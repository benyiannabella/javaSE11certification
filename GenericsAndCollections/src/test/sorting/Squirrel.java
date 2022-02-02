package test.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Squirrel {
    String species;
    int weight;

    public Squirrel(String species, int weight) {
        this.species = species;
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "species='" + species + ", weight=" + weight;
    }

//    public static int comparing(Squirrel s1, Squirrel s2, Comparator<Squirrel> c){
//        return c.compare(s1, s2);
//    }

    public static void main(String[] args) {
        List<Squirrel> l = new ArrayList<>();
        l.add(new Squirrel("Brown squirrel", 300));
        l.add(new Squirrel("Gray squirrel", 200));

        Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
                .thenComparingInt(Squirrel :: getWeight).reversed();
        System.out.println(l);
    }
}
