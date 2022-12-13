package ru.mirea.task10;
import java.util.Scanner;

public class Main {
    static void task1(int n, int y) {
        y++;
        if (y != n) {
            System.out.print(n);
            task1(n, y);
        }

    }

    static void task2(int n) {
        if (n > 0) {
            task2(n / 10);
            System.out.print(n % 10 + " ");
        }
    }

    static void task3(int n) {
        if (n/10 != 0) {
            System.out.print(n%10 + " ");
            task3(n/10);
        } else {
            System.out.print(n);
        }
    }

    public static void task4(int max, int count) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            if (n > max) {
                task4(n, 1);
            }

            else if (n == max) {
                task4(max, ++count);
            }

            else { task4(max, count); }
        }
        else { System.out.println(count);}
    }


    public static int task5() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) { return 0;}
        else {
            return Math.max(n, task5());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1)Дана монотонная последовательность; k встречается ровно k раз.");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            task1(i, -1);
            System.out.print(" ");
        }

        System.out.println("\n14)Выведите все цифры натурального числа N в обычном порядке.");
        n = scanner.nextInt();
        task2(n);

        System.out.println("\n15)Выведите все цифры натурального числа N в обратном порядке.");
        n = scanner.nextInt();
        task3(n);

        System.out.println("\n16)Количество элементов, равных максимуму.");
        task4(0, 0);

        System.out.println("\n17)Максимум из последовательности.");
        System.out.println(task5());


    }
}
