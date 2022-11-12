package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("-test of the 'Circle' class-\n");
        Circle c = new Circle();

        c.setRadius(1);
        System.out.println("Only radius: " + c.getRadius());
        System.out.println("\nOnly diameter: " + c.calcDiameter());
        System.out.println("\n" + c);

    }

}
