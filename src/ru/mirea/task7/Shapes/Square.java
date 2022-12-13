package ru.mirea.task7.Shapes;

public class Square extends Rectangle{
    private double side;

    public Square() { this.side = 1.0; }
    public Square(double radius) { this.side = radius; }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() { return side; }
    public void setSide( double side ) { this.side = side; }

    @Override
    public void setWidth(double width) { this.width = width; }
    @Override
    public void setLength( double length) { this.length = length; }

    @Override
    public String toString() {
        return "\nSquare. Side = " + side +
                "\nArea = " + getArea() +
                "\nPerimeter = " + getPerimeter();
    }
}
