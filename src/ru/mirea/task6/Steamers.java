package ru.mirea.task6;

public class Steamers implements Nameable{
    private String name;

    public void setName(String name) { this.name = name; }
    @Override
    public String getName() { return name; }
}
