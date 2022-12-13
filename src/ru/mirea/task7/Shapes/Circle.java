package ru.mirea.task7.Shapes;

public class Circle extends Shape{
    protected double radius;

    public Circle() { this.radius = 1.0; }
    public Circle(double radius) { this.radius = radius; }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public void setRadius(double radius) { this.radius = radius; }
    public double getRadius() { return radius; }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * 3.14;
    }

    @Override
    public String toString() {
        return "\nCircle. Radius = " + radius +
                "\nArea = " + getArea() +
                "\nPerimeter = " + getPerimeter();
    }
}
