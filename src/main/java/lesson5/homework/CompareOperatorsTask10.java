package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Операторы сравнения.
 * Задача 10.Ввести с консоли целую переменную x, затем вторую целую переменную y. Провести валидацию.
 *           Поменять значения переменных местами и вывести их на экран.
 */
public class CompareOperatorsTask10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 1-е число:");
        if(scan.hasNextInt()) {
            int x = scan.nextInt();
            System.out.println("Введите 2-е число:");
            if (scan.hasNextInt()){
                int y = scan.nextInt();
            int c = y;
            y = x;
            x = c;
            System.out.println(x + "; " + y);
        }else{
                System.out.println("Вы ввели не число");
            }
        }
        else{
            System.out.println("Вы ввели не число");
        }

    }
}
