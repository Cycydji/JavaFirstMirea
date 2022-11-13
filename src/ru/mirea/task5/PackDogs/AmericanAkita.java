package ru.mirea.task5.PackDogs;

public class AmericanAkita extends Dog{
    AmericanAkita(String name, char gender, int age) {
        super(name, gender, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Oh! This is a very formidable and powerful bark.");
    }

    @Override
    public void cost() {
        System.out.println("American Akita can cost from 20K to 75K.");
    }

    @Override
    public void kindness() {
        System.out.println("In appearance, this dog is unfriendly, but good at heart..");
    }
}
