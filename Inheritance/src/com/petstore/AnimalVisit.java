package com.petstore;

import java.time.LocalDate;

class Dog extends Animal{
    private int pedigreeId;
    private LocalDate chipDate;

    public Dog(String name, String owner, String breed, AnimalType type, int pedigreeId) {
        super(name, owner, breed, type);
        this.pedigreeId = pedigreeId;
    }

    @Override
    public String toString() {
        String str = super.toString();
        if(pedigreeId > 0){
            str+="(pedigreeId = " + pedigreeId + ")";
        }
        return str;
    }

    public LocalDate getChildChipDate(){
        System.out.println("child chipDate");
        return chipDate;
    }

    @Override
    public void setChipDate(LocalDate chipDate) {
        this.chipDate = chipDate;
    }

    public static void examineAnimal(){
        System.out.println("Examine for breathing problems");
    }
}
public class AnimalVisit {
    public static void main(String[] args) {
        // Create a Dog
        Dog pug = new Dog("George", "Ralph", "Pug", Animal.AnimalType.DOG, 775533);

        // Call a method on the superclass from the subclass instance
        pug.setChipDate(LocalDate.now());

        // Call the overridden method (note that toString() is implied
        System.out.println(pug);

        // Call the overridden method
        System.out.println("Chip Date = " + pug.getChipDate());

        // Try to force the call to the parent's method
        Animal a = pug;
        System.out.println("Chip Date = " + a.getChipDate());

        // Call the supplemented method
        System.out.println("Chip Date = " + pug.getChildChipDate());

        // Call the static methods
        Animal.examineAnimal();
        Dog.examineAnimal();
    }

}
