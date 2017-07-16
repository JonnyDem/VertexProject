package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Операторы сравнения.
 *  Задача 11. Запросить у пользователя цифру в виде целого числа, провести валидацию введенного значения.
 *             Если пользователь ввел не число или ввел не цифру, то сообщить ему об этом.
 *             Вывести на экран текстовое название цыфры.
 *
 */
public class CompareOperatorsTask11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите цифру");

       if(scan.hasNextInt()) {
           int a = scan.nextInt();

           if (a == 0) {
               System.out.println("Ноль");
           } else if (a == 1) {
               System.out.println("Один");
           } else if (a == 2) {
               System.out.println("Два");
           } else if (a == 3) {
               System.out.println("Три");
           } else if (a == 4) {
               System.out.println("Четыре");
           } else if (a == 5) {
               System.out.println("Пять");
           } else if (a == 6) {
               System.out.println("Шесть");
           } else if (a == 7) {
               System.out.println("Семь");
           } else if (a == 8) {
               System.out.println("Восемь");
           } else if (a == 9) {
               System.out.println("Девять");
           } else if (a > 9) {
               System.out.println("Вы ввели число, а не цыфру");
           } else if (a < 0) {
               System.out.println("Это число меньше нуля");
           }
       }  else {
                System.out.println("Вы ввели не цифру");
            }


    }
}
