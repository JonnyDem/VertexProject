package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Методы.
 *  Задача 3. Написать метод getMultyPly, который принимает два целых числа и возвращает произведение этих чисел.
 *            В main считать два целых числа, передать методу getMultyPly и вывести результат на экран.
 */
public class MethodsTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1-е число.");
        int a = scan.nextInt();
        System.out.println("Введите 2-е число.");
        int b = scan.nextInt();
        getMultyPly(a,b);
        scan.close();
    }

    public static int getMultyPly(int a, int b) {
        int c=a*b;
        System.out.println("Результат произведения: "+c);
        return c;
    }
}
