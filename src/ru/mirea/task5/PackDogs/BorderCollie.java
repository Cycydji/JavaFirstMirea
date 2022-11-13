package ru.mirea.task5.PackDogs;

public class BorderCollie extends Dog{
    BorderCollie(String name, char gender, int age) {
        super(name, gender, age);
    }

    public void shepherd() {
        System.out.println("Oh! Someone has started herding your pets!.");
    }

    @Override
    public void makeSound() {
        System.out.println("Loud good barking, without negativity.");
    }

    @Override
    public void cost() {
        System.out.println("The price of a border collie is from 1K to 120K rubles.");
    }

    @Override
    public void kindness() { System.out.println("This is a very kind dog."); }
}
