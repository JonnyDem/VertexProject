package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Операторы сравнения.
 *   Задача 5: Считать с консоли три числа. Определить наибольшее из них.
 */
public class CompareOperatorsTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        System.out.println("Введите третье число");
        int c = scan.nextInt();
        scan.close();
        if (a > b && a > c){
            System.out.println(a+" самое большое.");
        }else if(b > a && b > c){
            System.out.println(b+" самое большое.");
        } else if (c > a && c > b) {
            System.out.println(c + " самое большое.");
        } else {
            System.out.println("Есть равные числа.");
        }
    }
}
