package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Цыклы.
 * Задача 5: Считать с консоли два числа k и n (k > n). С помощью цыкла for вывести не экран числа от k до n.
 */
public class LoopsTask5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число k");
        int k = scan.nextInt();
        System.out.println("Введите число n");
        int n = scan.nextInt();
        scan.close();
        for (int i =k ; i >=n ; i--) {
            System.out.println(k);
            k--;
        }
    }
}
