package ru.mirea.task2;

public class Ball {
    private final String color;
    private final String type;
    private final int price;

    public Ball(String color, String type, int price){
        this.color = color;
        this.type = type;
        this.price = price;

    }
    public String toString() { return  "This " + color + " " + type + " can be bought for " + price + " rubles.\n"; }
}
