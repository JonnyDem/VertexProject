package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Оператор if.
 *  Задача 3: Считать с консоли целое число. Проверит четноссть.
 */
public class OperatorIfTask3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите целое число.");
        int a = scan.nextInt();
        scan.close();
        if (a % 2 == 0) {
            System.out.println("Четное.");
        } else {
            System.out.println("Не четное.");
        }
    }
}
