package ru.mirea.task3;

public class Book {
    String author, name;
    int pages, price, year;

    public void setAuthor(String setterA) { this.author = setterA; }
    public String getAuthor() { return author; }

    public void setName(String setterName) { this.name = setterName; }
    public String getName() { return name; }

    public void setPages(int setterPages) { this.pages = setterPages; }
    public int getPages() { return pages; }

    public void setPrice(int setterPrice) { this.price = setterPrice; }
    public int getPrice() { return price; }

    public void setYear(int setterYear) { this.year = setterYear; }
    public int getYear() { return year; }

    public String toString() {
        return "Book <<" + name + ">> " + author + "\nWritten in " + year
                + "\nPages: " + pages + ", Price: " + price + "\n";
    }

}

