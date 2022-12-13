package ru.mirea.task7.Moves;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    MovablePoint(int x, int y, int xS, int yS){
        this.x = x;
        this.y = y;
        this.xSpeed = xS;
        this.ySpeed = yS;
    }
    @Override
    public void moveUp() { y++; ySpeed++;}

    @Override
    public void moveDown() { y--; ySpeed++;}

    @Override
    public void moveRight() { x++; xSpeed++;}

    @Override
    public void moveLeft() { x--; xSpeed++;}

    public String toString(){
        return "point - [" + x + "; " + y + "]"
                +"\nspeed - ("+ xSpeed + "; " + ySpeed + ")";
    }
}
