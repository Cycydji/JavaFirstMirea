package ru.mirea.task6;

public class Auto implements Nameable {
    private String name;

    public void setName(String name) { this.name = name; }
    @Override
    public String getName() { return name; }

}
