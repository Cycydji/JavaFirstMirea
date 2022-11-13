package ru.mirea.task5.PackDogs;

public abstract class Dog {
        private final String name;
        private final char gender;
        private final int age;

        Dog(String name, char gender, int age){
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() { return name; }
        public char getGender() { return gender; }
        public int getAge() { return age; }

        public abstract void makeSound();
        public abstract void cost();
        public abstract void kindness();

}
