package ru.mirea.task2;
import java.util.Scanner;

public class TesterClass {
    public static void main(String[] args) {

        System.out.println("-test of the 'Shapes' class-");
        Shape cube = new Shape("cube", 3, 8);
        System.out.println(cube);

        System.out.println("-test of the 'Ball' class-");
        Ball one = new Ball("Red", "basketball", 2300);
        System.out.println(one);

        System.out.println("-test of the 'Book' class-");
        Book Dante = new Book("Dante", "the Divine comedy", 763, 2500);
        System.out.println(Dante);

        System.out.println("-test of the 'Dog' class-");
        Dog fuf = new Dog("Fuf", 14);
        System.out.println(fuf);
        System.out.println(fuf.dogHumanAge());

        System.out.println(fuf.getAge());
        System.out.println(fuf.getName());
        fuf.setName("NoFuf");
        fuf.setAge(9);
        System.out.println(fuf);


        System.out.println("\n-test of the 'TestDog' class-");
        String name_Dog;
        int age_Dog;
        Scanner in = new Scanner(System.in);

        TestDog dog = new TestDog();
        System.out.println("Введите собаку");
        name_Dog = in.next();  // first input of the dog's name

        while(!(name_Dog.equals("none"))) {
            System.out.println("Введите ее возраст");
            age_Dog = in.nextInt();  // input of the age of the dog
            Dog addy = new Dog(name_Dog, age_Dog);  // create a dog
            dog.dogAdd(addy);  // add in class-array
            System.out.println("Введите новую собаку или none");
            name_Dog = in.next();
        }

        System.out.println("Массив собак:");
        dog.dogOut();
    }
}
