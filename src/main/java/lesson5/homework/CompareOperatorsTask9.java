package lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Операторы сравнения.
 *  Задача 9: Запросить у пользователя четырехзначное целое число. Произвести валидацию.Определить, есть ли в нем
 *            хоть один ноль.
 */
public class CompareOperatorsTask9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите четырехзначное целое число.");
        int a = scan.nextInt();
        String b = String.valueOf(a);
        char[] array = new char[b.length()];
        scan.close();
        int numberOfZeros = 0;

        if (a > 999 && a < 10000) {
            for (int i = 0; i < b.length(); i++) {
                array[i] = b.charAt(i);
                if (array[i] == '0') {
                    numberOfZeros++;
                }
            }
        }else{
            System.out.println("Введите число то 1000 до 9999");
        }

        if (numberOfZeros > 0) {
            System.out.println("Да, в этом числе есть ноль.");
            System.out.println("Колличество нулей: " + numberOfZeros);
        }else if(numberOfZeros==0 && a > 999 && a < 10000){
            System.out.println("Нет, в этом числе нет нулей.");
        }
    }
}

