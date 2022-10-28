package ru.mirea.task1.opt3;


public class forInput {
    public static void main(String[] arg) {
        System.out.println("Аргументы командной строки\n");

        for (int i = 0; i < arg.length; i++) {
            System.out.println((i+1) + ") " + arg[i]);
        }

    }
}
