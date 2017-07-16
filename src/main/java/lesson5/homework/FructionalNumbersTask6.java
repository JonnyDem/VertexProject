package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Работа с дробными числами и преобразование типов.
 *   Задача 6: Ввести дробное денежное число(double). Вывести целое значение  копеек.
 */
public class FructionalNumbersTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное денежное число (например: 5,67).");
        double a = scan.nextDouble();
        scan.close();
        int b = (int) a;
        double c = a - b;
        double d = c * 100;
        int coins = (int) d;
        System.out.println("Целое число копеек: "+coins);
    }
}
