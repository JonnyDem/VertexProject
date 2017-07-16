package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Сканнер.
 *   Задача 3: Считать целое число с консоли, затем второе.Вывести сумму чисел на экран.
 */
public class ScannerTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number.");
        int a = scan.nextInt();
        System.out.println("Enter second number.");
        int b = scan.nextInt();
        int c=a+b;
        System.out.println("Sum is "+c);
    }
}
