package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Работа с дробными числами и преобразование типов.
 *   Задача 5: Ввести дробное число. Вывести целую часть.
 */
public class FructionalNumbersTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное число.");
        double a = scan.nextDouble();
        int b = (int) a;
        System.out.println(b);
        scan.close();
    }
}
