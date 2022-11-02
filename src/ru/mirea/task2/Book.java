package ru.mirea.task2;

public class Book {
    String author;
    String name;
    int pages;
    int price;

    public Book(String author, String name, int pages, int price){
        this.author = author;
        this.name = name;
        this.pages = pages;
        this.price = price;

    }
    public String toString() {
        return   "Buy for " + price +"\nAuthor - " + author + "\nBook - " + name
                + "\nNumber of pages: " + pages + "\n";}

}
