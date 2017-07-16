package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Методы.
 *  Задача 9: Написать: метод int[] getArray(int k), который принимает число k, создает массив из k элементов,
 *            заполняет числами от 10 до ... с шагом 2(увеличивая) и возвращает массив.
 *            Метод void printVector(int[] vector), который выводит массив на экран.
 *            В main объявить переменную типа массив, присвоить ей вызов этого метода и вывести массив на экран.
 */
public class MethodsTask9 {
    public static void main(String[] args) {

        int[] mas = getArray(namberOfElements());
    }

    private static int namberOfElements() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите число элементов массива.");
        int n=scan.nextInt();
        return n;
    }

    private static void printVector(int[]vector) {
        System.out.println(Arrays.toString(vector));
    }

    public static int[] getArray(int k) {
        int[] array = new int[k];
        int index = 0;
        for (int i = 0; i <k ; i++) {
            array[i] = 10 + index;
            index += 2;
        }
        printVector(array);
        return array;
    }
}
