package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Методы.
 *  Задача 7: Написать метод, который принимает массив целых чисел, заполняя по такому принцыпу:
 *            -элементы с четными индексами значением номера элемента.
 *            -элементы с нечетными индексами значением 0.
 *            -вывести массив на экран.(1,0,3,0,5,0,7,0...)
 */
public class MethodsTask7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите число элементов массива.");
        int n = scan.nextInt();
        scan.close();
        int[] array = new int[n];
        fillArray(array);
        System.out.println(Arrays.toString(array));
    }

    private static void fillArray(int[]vect) {
        for (int i = 0; i <vect.length ; i++) {
            if(i%2==0){
                vect[i]=i+1;
            }else{
                vect[i]=0;
            }
        }
    }
}
