package ru.mirea.task5.PackDogs;

public class TestDogs {
    public static void main(String[] args) {
        System.out.println("-test of the 'Dog' class-\n");

        Pug p = new Pug("Goga", 'M', 12);
        p.spittle();
        p.makeSound();
        System.out.println("->This "+ p.getAge() +" years old Pug "+ p.getName()
                +" (" + p.getGender() + ") was barking at you," + " , don't be afraid.");
        p.cost();
        p.kindness();
        System.out.println("\n");


        BorderCollie b = new BorderCollie("Cowgirl", 'F', 4);
        b.shepherd();
        b.makeSound();
        System.out.println("->This "+ b.getAge() +" years old Border Collie "+ b.getName()
                +" (" + b.getGender() + ") was barking at you," + " , say hello.");
        b.cost();
        b.kindness();
        System.out.println("\n");

        AmericanAkita a = new AmericanAkita("Sam",'M', 1);
        a.makeSound();
        System.out.println("->This "+ a.getAge() +" years old American Akita "+ a.getName()
                +" (" + a.getGender() + ") was barking at you," + " , don't hide.");
        a.cost();
        a.kindness();
    }
}
