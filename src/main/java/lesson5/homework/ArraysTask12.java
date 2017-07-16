package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Массивы.
 *   Задача 12: Создать массив из n элементов. С заполнением последовательностью m, m-2, m-4 и так далее
 *              Вывести массив на экран. С консоли считать m и n.
 */
public class ArraysTask12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n");
        int n=scan.nextInt();
        System.out.println("Введите число m");
        int m=scan.nextInt();
        scan.close();

        int[]array=new int[n];
        int index=0;
        for (int i = 0; i <n ; i++) {
            array[i]=m-index;
            index+=2;
        }
        System.out.println(Arrays.toString(array));
    }
}
