package lesson5.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Массивы.
 *   Задача 10: Создать массив из n элементов целых чисел. Считать n с консоли. Зполнить случайными значениями от 0 до
 *              100. Во второй элемннт поместить сумму 2-го и 3-го элемента.
 *
 */
public class ArraysTask10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число n.");
        int n = scan.nextInt();
        scan.close();

        Random random = new Random();
        int[] array = new int[n];
        for (int i = 0; i <n ; i++) {
            int a=random.nextInt(100);
            array[i] = a;
        }
        System.out.print("Массив до суммы 2-го и 3-го элемнта: ");
        System.out.println(Arrays.toString(array));
        array[1] = array[1] + array[2];
        System.out.print("Массив после суммы 2-го и 3-го элемента: ");
        System.out.println(Arrays.toString(array));
    }

}
