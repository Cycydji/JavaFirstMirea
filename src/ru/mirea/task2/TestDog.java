package ru.mirea.task2;
import java.util.ArrayList;

public class TestDog {
    ArrayList<Dog> dogs = new ArrayList<>();

    public void dogAdd(Dog newDog) {
        dogs.add(newDog);
    }

    public void dogOut() { System.out.println(dogs); }
}
