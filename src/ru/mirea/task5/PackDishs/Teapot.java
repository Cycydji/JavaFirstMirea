package ru.mirea.task5.PackDishs;

public class Teapot extends Dish{
    Teapot(String material, String size) {
        super(material, size);
    }

    public void Dirt(){
        System.out.println("Something is moving at the bottom of the kettle... " +
                "Damn, it's a mud monster! Why hasn't anyone removed it?");
    }

    @Override
    public void makeGrindingNoise() {
        System.out.println("The Teapot makes a muffled sound with an echo..");
    }

    @Override
    public void forWhat() {
        System.out.println("Pour tea or compote or sth else out of it.");
    }

    @Override
    public void placeTheCat() {
        System.out.println("You can put one adult slim Cat there! He went to bed there, " +
                "it looks like we're without tea today...");
    }
}
