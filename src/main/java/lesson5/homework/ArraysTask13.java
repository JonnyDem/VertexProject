package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Массивы.
 *   Задача 12: Создать массив из n элементов. Заполнить массив числами: посередине 0, затем вправо и влево
 *              увеличиваем на 1. Если количество элементов четное, то внутри должно быть 2 нуля.
 *              Вывести массив на экран. Пример: 5, 4, 3, 2 , 1, 0, 1, 2, 3, 4, 5
 */
public class ArraysTask13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите число n (количество элементов массива).");
        int n=scan.nextInt();
        scan.close();

        int[] array=new int[n];

        if(n%2==0){
            for (int i = 0; i <array.length/2 ; i++) {
              array[array.length/2-1-i]=i;
                array[array.length/2+i]=i;
            }
        }else {
            for (int i = 0; i < array.length / 2 + 1; i++) {
                array[array.length / 2 - i] = i;
                array[array.length / 2 + i] = i;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
