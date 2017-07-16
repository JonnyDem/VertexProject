package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Цыклы.
 * Задача 7: Нарисовать прямоугольник из звездочек. Считать с клавиатуры значение ширины и высоты.
 *           С помощью цыкла for нарисовать прямоугольник, состоящий из звездочек "*".
 */
public class LoopsTask7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника");
        int width = scan.nextInt();
        System.out.println("Введите высоту прямоугольника");
        int height = scan.nextInt();
        scan.close();
        for (int i = 0; i <width ; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i <height-2 ; i++) {
            System.out.print("*");
            for (int j = 0; j <width-2 ; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <width ; i++) {
            System.out.print("*");
        }
    }
}
