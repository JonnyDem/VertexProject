package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 17.07.2017.
 * Тема: Работа со строками.
 *   Задача 5: Написать метод, принимающий в качестве параметра строку и определяющий равны ли первый и последний
 *             символы в строке.
 */
public class LinesTask5 {
    public static void main(String[] args) {
        String s = getString();
        isFirstLastCharsEquals(s);
    }

    private static String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку, в которой вы хотите сравнить первый и последний символы.");
        String text = scan.nextLine();
        scan.close();
        return text;
    }

    public static boolean isFirstLastCharsEquals(String s) {
        boolean c;
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            c = true;
            System.out.println("Да,символы совпадают.");
        } else {
            c = false;
            System.out.println("Нет, символы не совпадают.");
        }
        return c;
    }
}
