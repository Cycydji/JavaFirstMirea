package ru.mirea.task3.Hum;

public class HumanTest {
    public static void main(String[] args) {
        System.out.println("-test of the 'Book' class-\n");

        Human h = new Human();
        // /*
        h.setFirstName("Qwerty");
        h.setLastName("Azas");
        h.setAge(12);
        // */

        System.out.println(h);

        h.classBody();
        h.classHead();
        h.classHand();
        h.classLeg();

    }
}
