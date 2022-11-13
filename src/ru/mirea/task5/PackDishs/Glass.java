package ru.mirea.task5.PackDishs;

public class Glass extends Dish {
    Glass(String material, String size) {
        super(material, size);
    }

    public void Sloppy(){
        System.out.println("Oh! The glass shattered all over the kitchen;(");
    }

    @Override
    public void makeGrindingNoise(){ System.out.println("Glass makes Ding!.."); }

    @Override
    public void forWhat() { System.out.println("Glass for drinking."); }

    @Override
    public void placeTheCat() {
        System.out.println("You can put one kitten in a Glass, no more..");
    }
}

