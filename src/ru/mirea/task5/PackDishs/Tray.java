package ru.mirea.task5.PackDishs;

public class Tray extends  Dish{
    Tray(String material, String size) {
        super(material, size);
    }

    @Override
    public void makeGrindingNoise() {
        System.out.println("Well, the disgusting screeching... My ears are bad.");
    }

    @Override
    public void forWhat() {
        System.out.println("To wear something delicious on it, such as a baked duck.");
    }

    @Override
    public void placeTheCat() {
        System.out.println("Oh! Here you can put a big fat and fluffy cat!");
    }
}
