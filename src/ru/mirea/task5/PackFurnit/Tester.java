package ru.mirea.task5.PackFurnit;

public class Tester {
    public static void main(String[] args) {
        System.out.println("-test of the 'Furniture' class-\n");

        Wardrobe w = new Wardrobe("wood(oak)", "budget", "large");
        System.out.print("You are looking at " + w);
        w.delivery();
        w.assembling();

        Lamp l = new Lamp("steel", "ordinary", "small");
        System.out.print("\nYou are looking at " + l);
        l.delivery();
        l.assembling();

        Jacuzzi j = new Jacuzzi("polymers", "wealthy", "large", 500);
        System.out.print("\nYou are looking at " + j);
        j.delivery();
        j.assembling();


        System.out.println("\ntest of the 'FurnitureShop' class-\n");

        FurnitureShop shop = new FurnitureShop();
        shop.furAdd(w);
        shop.furAdd(l);
        shop.furAdd(j);

        System.out.println("Массив мебели:");
        shop.furOut();
    }
}
