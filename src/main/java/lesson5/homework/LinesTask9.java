package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 17.07.2017.
 * Тема: Работа со строками.
 *   Задача 9: Написать метод, возвращающий вторую половину строки.
 */
public class LinesTask9 {
    public static void main(String[] args) {
        String a = getString();
        cutString(a);
    }

    private static String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scan.nextLine();
        scan.close();
        return text;
    }

    private static String cutString(String a) {
        String b = a.substring(a.length() / 2);
        System.out.println(b);
        return b;
    }
}
