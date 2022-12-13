package ru.mirea.task7.Shapes;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 1.0;
        this.length = 2.0;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }


    public Double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public Double getLength() { return length; }
    public void setLength( double length) { this.length = length; }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }


    public String toString() {
         return "\nRectangle. Width = " + width + " Length = " + length +
                "\nArea = " + getArea() +
                "\nPerimeter = " + getPerimeter();
    }
}
