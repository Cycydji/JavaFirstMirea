package ru.mirea.task6;

public class Wallet implements Priceable{
    private double price;


    public void setPrice(double price){ this.price = price; }
    @Override
    public double getPrice() { return price; }
}
