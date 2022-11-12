package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        System.out.println("-test of the 'Book' class-\n");
        Book b = new Book();

        b.setName("the Divine comedy");
        b.setAuthor("Dante");
        b.setYear(1320);
        b.setPages(763);
        b.setPrice(2500);

        System.out.println("Only Name: " + b.getName());
        System.out.println("Only Author: " + b.getAuthor());
        System.out.println("Only Year: " + b.getYear());
        System.out.println("Only Pages: " + b.getPages());
        System.out.println("Only Price: " + b.getPrice());
        System.out.println("\n" + b);

    }
}
