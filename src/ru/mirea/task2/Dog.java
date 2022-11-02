package ru.mirea.task2;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String dogHumanAge(){
        return "Возраст собаки " + name + " по человеческим меркам = " + (age*7);
    }

    public String toString(){ return "Собака - " + name + ", Возраст - " + age;}

}
