package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Цыклы.
 * Задача 8: Нарисовать прямоугольник из звездочек по краям. (Анологично задаче 7, только внутри пробелы).
 *
 */
public class LoopsTask8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника");
        int width = scan.nextInt();
        System.out.println("Введите высоту прямоугольника");
        int height = scan.nextInt();
        scan.close();

        System.out.print("*");
        for (int i = 0; i <width-2 ; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i <height-2 ; i++) {
            System.out.println(" ");
        }
        System.out.print("*");
        for (int i = 0; i <width-2 ; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
    }
}
