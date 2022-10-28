package ru.mirea.task1.opt3;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


public class RandomAndSort {
    public static void main(String[] arg) {
        System.out.println("Генерируется массив целых чисел и сортируется\n");

        //Entering the number of elements
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int num = scanner.nextInt();

        //The random() method of the Math class
        System.out.println("Метод random() класса Math");
        int[] arr = random1(new int[num]);

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        //Random class
        System.out.println("\nКласс Random");
        int[] array = random2(new int[num]);

        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }

    private static int[] random2(int[] arr2) {
        Random random = new Random();
        for(int i = 0; i < arr2.length; i++) {
            //range from 0 to 40
            arr2[i] = random.nextInt(40);
        }
        return arr2;
    }

    private static int[] random1(int[] arr1) {
        for(int i = 0; i < arr1.length; i++) {
            //range from 0 to 20
            arr1[i] = (int) (Math.random() * 20);
        }
        return arr1;

    }
}
