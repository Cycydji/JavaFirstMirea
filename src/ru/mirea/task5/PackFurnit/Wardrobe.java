package ru.mirea.task5.PackFurnit;

public class Wardrobe extends Furniture{
    Wardrobe(String material, String typeBuyers, String size) {
        super(material, typeBuyers, size);
    }

    @Override
    public void delivery() {
        System.out.println("-The delivery will depend more on the delivery distance.");
    }
    @Override
    public void assembling() {
        System.out.println("-The assembly will cost normally.");
    }

    public String toString(){
        return "a " + getSize() + "-sized " +
                getMaterial() + " {wardrobe}, type: "+ getTypeBuyers() + "\n";
    }
}
