package ru.mirea.task5.PackDishs;

public class TestDish {
    public static void main(String[] args) {
        System.out.println("-test of the 'Dish' class-\n");


        Glass g = new Glass("Glass", "Middle");
        System.out.println("-A " + g.getSize()+ " glass made of "+ g.getMaterial());
        g.whereIt();
        g.makeGrindingNoise();
        g.forWhat();
        g.placeTheCat();
        g.Sloppy();

        Teapot t = new Teapot("Ceramic", "Big");
        System.out.println("\n-A " + t.getSize()+ " teapot made of "+ t.getMaterial());
        t.makeGrindingNoise();
        t.forWhat();
        t.placeTheCat();
        t.Dirt();

        Tray r = new Tray("Metal", "Middle");
        System.out.println("\n-A " + r.getSize()+ " tray made of "+ r.getMaterial());
        r.makeGrindingNoise();
        r.forWhat();
        r.placeTheCat();

    }
}
