package ru.mirea.task5.PackDishs;
// концепция, несамостоятельный класс
public abstract class Dish {
    private final String material;
    private final String size;

    Dish(String material, String size){
        this.material = material;
        this.size = size;
    }

    public void whereIt(){
        System.out.println("It's in the cupboard");
    }

    public String getMaterial() { return material; }
    public String getSize() { return size; }

    public abstract void makeGrindingNoise();
    public abstract void forWhat();
    public abstract void placeTheCat();
}
