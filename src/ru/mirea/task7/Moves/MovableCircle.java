package ru.mirea.task7.Moves;

public class MovableCircle implements Movable{
    //что такое скорость точки? зачем она тут..
    private final int radius;
    private final MovablePoint center;

    MovableCircle(int x, int y, int xS, int yS, int radius){
        this.center = new MovablePoint(x, y, xS, yS);
        this.radius = radius;

    }

    @Override
    public void moveUp() { center.moveUp();}

    @Override
    public void moveDown() { center.moveDown();}

    @Override
    public void moveRight() { center.moveRight();}

    @Override
    public void moveLeft() { center.moveLeft();}

    public String toString(){
        return center + "\nradius = " + radius;
    }
}

