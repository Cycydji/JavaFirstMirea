package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args){
        Ball b = new Ball();
        System.out.println("First coordinates: \n" + b);
        b.setX(3.0);
        b.setY(5.5);
        System.out.println("Coordinates now: [" + b.getX() + "; " + b.getY() + "]\n");

        System.out.println("x - 1.0; y + 0.5");
        b.move(-1.0, 0.5);
        System.out.println("Coordinates now: \n" + b);

        System.out.println("\nUpdate date");
        b.setXY(-10.0, 10.0);
        System.out.println("Final coordinates: \n" + b);
    }
}
