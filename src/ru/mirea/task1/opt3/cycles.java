package ru.mirea.task1.opt3;
import java.util.Scanner;


public class cycles {

    public static void main(String[] args) {
        System.out.println("Циклы\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел массива");
        int q = scanner.nextInt();
        int[] arr = new int[q];

        for (int i = 0; i < q; i++) {
            System.out.println("Введите число " + (i+1));
            arr[i] = scanner.nextInt();
        }

        sumFromFor(arr);
        sumFromWhile(arr);
        sumFromDoWhile(arr);

    }

    private static void sumFromDoWhile(int[] arr) {
        int sum = 0;
        int i = 0;

        do{
            sum += arr[i];
            i++;
        } while (i < arr.length);

        System.out.println("Цикл do while посчитал, что...");
        System.out.println("Сумма равна = " + sum + "\n");
    }

    private static void sumFromWhile(int[] arr) {
        int sum = 0;
        int i = 0;

        while(i < arr.length){
            sum += arr[i];
            i++;

        }
        System.out.println("Цикл while посчитал, что...");
        System.out.println("Сумма равна = " + sum);
    }

    private static void sumFromFor(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Цикл for посчитал, что...");
        System.out.println("Сумма равна = " + sum);
    }
}
