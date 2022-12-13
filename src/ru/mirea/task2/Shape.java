package ru.mirea.task2;

public class Shape {
    private final String name;
    private final int dimensional;
    private final int square;

    public Shape(String name, int dimensional, int square){
        this.name = name;
        this.dimensional = dimensional;
        this.square = square;

    }
    public String toString() { return  "Figure - " + name + ", " + dimensional +
            "-dimensional, " + "S = " + square + "\n"; }

}

