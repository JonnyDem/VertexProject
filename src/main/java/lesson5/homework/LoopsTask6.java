package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Цыклы.
 * Задача 6: Считать с клавиатуры число k. Вывести на экран k звездочек.
 */
public class LoopsTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число k");
        int k = scan.nextInt();
        scan.close();
        for (int i = 0; i <k ; i++) {
            System.out.println("*");
        }
    }
}
