package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args){
        System.out.println("-test of the 'Author' class-\n");

        Author a = new Author("Dante", "dante.comedian@gmail.com", 'M');
        System.out.println(a + "\n");

        System.out.println("Name: " + a.getName());

        System.out.println("Email было:  " + a.getEmail());
        a.setEmail("dante.author@edu.mirea.ru");
        System.out.println("Email стало: "+ a.getEmail());

        System.out.println("Gender: " + a.getGender());
    }
}
