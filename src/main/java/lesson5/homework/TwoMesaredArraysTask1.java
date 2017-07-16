package lesson5.homework;

import java.util.Random;

/**
 * Created by Ваня on 14.07.2017.
 * Задача 1. Тема: Двумерные массивы. В мейне должны быть:  1. Объявить переменную двумерного массива.
 *                                                          2. Метод который заполняет массив числами от 10 до 30.
 *                                                          3. Метод который выводит массив на экран.
 *                                                          4. Метод который умножает все элементы массива в 2 раза.
 *
 */
public class TwoMesaredArraysTask1 {
    public static Random random = new Random();
    public static void main(String[] args) {

         int[][] array = new int[5][5];
         fillArray(array);
         showArray(array);
         multiplyInTwoTimes(array);
    }

    private static void multiplyInTwoTimes(int[][] array) {   // Метод который умножает все элементы массива в 2 раза.
        System.out.println("Array after multiplication:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= 2;
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void showArray(int[][]array) {                // Метод который выводит массив на экран.
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[1].length ; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void fillArray(int[][]array) {                  // Метод который заполняет массив числами от 10 до 30.

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int randomNumber = 10 + random.nextInt(21);

                array[i][j] = randomNumber;
            }
        }
    }
}

