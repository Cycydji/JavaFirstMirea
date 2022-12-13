package ru.mirea.task7.Moves;

public class MovableRectangle implements Movable{
    // who is your скорость точки
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    MovableRectangle(int xt, int yt, int xb, int yb, int xS, int yS){

        this.topLeft = new MovablePoint(xt, yt, xS, yS);
        this.bottomRight = new MovablePoint(xb, yb, xS, yS);
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public String toString(){
        return "top left point:\n" + topLeft +
                "\ntop right point:\n" + bottomRight;
    }
}
