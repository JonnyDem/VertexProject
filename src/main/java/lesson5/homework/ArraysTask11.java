package lesson5.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Массивы.
 *   Задача 11: Создать массив из n элементов целых чисел. Зполнить случайными значениями от 0 до 100.
 *              Поменять местами 1-й и последний элемент.
 */
public class ArraysTask11 {
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
        System.out.print("Массив до замены 1-го и последнего элемнта: ");
        System.out.println(Arrays.toString(array));
        int a = array[0];
        array[0]=array[array.length-1];
        array[array.length-1]=a;
        System.out.print("Массив после замены 1-го и последнего элемента: ");
        System.out.println(Arrays.toString(array));
    }
}
