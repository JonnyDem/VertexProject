package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Работа с дробными числами и преобразование типов.
 *  Задача 9: Ввести дробное число. Вывести первую цыфру после запятой на экран.
 */
public class FructionalNumbersTask9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное число.");
        double a = scan.nextDouble();
        int b=(int)a;
        double c = a - b;
        double d = c * 10;
        int e = (int) d;
        System.out.println("Первая цыфра после запятой: "+e);
        scan.close();
    }
}
