package ru.mirea.task7.Moves;

public class Main {

    public static void main(String[] args) {
        System.out.println("-Point-");
        MovablePoint p = new MovablePoint(0,0,0,0);
        System.out.println(p + "\n");
        p.moveRight();
        p.moveDown();
        System.out.println(p + "\n");

        System.out.println("-Circle-");
        MovableCircle c = new MovableCircle(1, 1, 1, 1, 1);
        System.out.println(c + "\n");
        c.moveUp();
        c.moveLeft();
        System.out.println(c + "\n");

        System.out.println("-Rectangle-");
        MovableRectangle r = new MovableRectangle(0,0,0,0,0,0);
        System.out.println(r + "\n");
        r.moveDown();
        r.moveDown();
        r.moveRight();
        r.moveRight();
        r.moveRight();
        System.out.println(r);
    }
}
