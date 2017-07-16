package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Операторы сравнения.
 *   Задача 8: Считать двухзначное целое число. Произвести валидацию. Определить первую цыфру числа
 *             и вывести ее на экран.
 */
public class CompareOperatorsTask8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите двухзначное целое число");
        int a = scan.nextInt();
        scan.close();
        if(a >=10 && a < 100) {
            int b = a / 10;
            System.out.println("Первая цифра числа: "+b);
        }else {
            System.out.println("Введите число от 10 до 99");
        }
    }
}
