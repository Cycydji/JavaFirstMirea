package ru.mirea.task3;

public class Circle {
    private double r; //radius

    public void setRadius(double setterR){ this.r = setterR; }
    public double getRadius() { return r;}

    public double calcDiameter(){
        //D=2R (диаметр)
        return r * 2;
    }

    public double calcSquare(){
        //S=πR^2 (площадь круга)
        return 3.14 * r * r;
    }

    public double calcC(){
        //C=2πR  (длина окружности)
        return 3.14 * r * 2;
    }

    public String toString() {
        return "Circle. \nRadius = " + r + ";\nDiameter = " + calcDiameter()
                + ";\nSquare = " + calcSquare() + ";\nLength = " + calcC() +";";
    }

}
