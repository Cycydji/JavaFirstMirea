package ru.mirea.task5.PackFurnit;

public abstract class Furniture {
    private final String material, typeBuyers, size;

    Furniture(String material, String typeBuyers, String size){
        this.material = material;
        this.typeBuyers = typeBuyers;
        this.size = size;
    }

    public String getMaterial() { return material; }
    public String getTypeBuyers() { return typeBuyers; }
    public String getSize() { return size; }

    public abstract void delivery();
    public abstract void assembling(); // сборка

}
