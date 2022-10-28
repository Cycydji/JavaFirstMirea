package ru.mirea.task1.opt3;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Факториал\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для факториала");
        int num = scanner.nextInt();
        System.out.print(num + "! = ");

        int factor = 1;

        while (num != 0) {
            factor *= num;
            num--;
        }

        System.out.println(factor);
    }
}
