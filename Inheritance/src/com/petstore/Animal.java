package com.petstore;

import java.time.LocalDate;

public class Animal {

    private String name = "Unspecified";
    private String owner = "Unspecified";
    private String breed = "Unspecified";
    private AnimalType type = AnimalType.UNKN;

    private LocalDate chipDate;

    static enum AnimalType{
        CAT, DOG, HORSE, HAMSTER, GOAT, SHEEP, UNKN;
    }


    public Animal(String name, String owner, String breed, AnimalType type) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.owner + "'s " + this.type + " is a " + this.breed + " named " + this.name;
    }

    public LocalDate getChipDate() {
        System.out.println("parent get chipDate");
        return chipDate;
    }

    public void setChipDate(LocalDate chipDate) {
        this.chipDate = chipDate;
    }

    public static void examineAnimal(){
        System.out.println("Check eyes");
        System.out.println("Check teeth");
        System.out.println("Check coat");
    }
}
