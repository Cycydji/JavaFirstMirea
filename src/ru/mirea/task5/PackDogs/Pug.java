package ru.mirea.task5.PackDogs;

public class Pug extends Dog{

    Pug(String name, char gender, int age) {
        super(name, gender, age);
    }
    public void spittle(){
        System.out.println("You're covered in dog spittle..");
    }

    @Override
    public void makeSound() {
        System.out.println("Oh! It's a flat muzzle quacking at me...");
    }

    @Override
    public void cost() {
        System.out.println("You can buy a Pug for at least 10, even for 80,000 rubles;)");
    }

    @Override
    public void kindness() {
        System.out.println("Pug is kind only to my grandmother:(");
    }
}
