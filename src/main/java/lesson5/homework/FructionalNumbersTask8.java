package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Работа с дробными числами и преобразование типов.
 *  Задача 8: Ввести целое двухзначное число. Вывести первую цыфру на экран.
 */
public class FructionalNumbersTask8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое двухзначное число.");
        int a = scan.nextInt();
        double b = a / 10;
        int c = (int) b;
        System.out.println("Первая цыфра числа: "+c);
        scan.close();
    }
}
