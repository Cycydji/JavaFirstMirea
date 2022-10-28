package ru.mirea.task1.opt3;


public class harmSeries {
    public static void main(String[] arg) {
        System.out.println("Гармонический ряд");
        System.out.print("= ");

        for (int i = 1; i <= 10; i++) {
            double num = 1.0 / i;
            String str;
            if (i<10){
                str = String.format("%.6f + ", num);
            }
            else{
                str = String.format("%.6f .", num);
            }
            System.out.print(str);
        }

    }
}
