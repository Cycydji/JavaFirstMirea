package ru.mirea.task5.PackFurnit;
import java.util.ArrayList;

public class FurnitureShop {
    ArrayList<Furniture> fur = new ArrayList<>();

    public void furAdd(Furniture newFur) {
        fur.add(newFur);
    }

    public void furOut() { System.out.println(fur); }
}
