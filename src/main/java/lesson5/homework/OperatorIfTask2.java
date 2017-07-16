package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Оператор if.
 *  Задача 2: Считать с консоли первое число, затем второе. Вывести на экран наибольшее из них.
 */
public class OperatorIfTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        scan.close();
        if (a > b) {
            System.out.println(a+" больше чем "+ b);
        } else if (a < b) {
            System.out.println(b + " больше чем " + a);
        } else {
            System.out.println("Эти числа равны");
        }
    }
}
