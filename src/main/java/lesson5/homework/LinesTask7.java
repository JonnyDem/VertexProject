package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 17.07.2017.
 *  Тема: Работа со строками.
 *   Задача 7: Написать метод, принимающий в качестве параметра строку. Возратить индекс первого вхождения символа "а"
 *             этой строки.
 */
public class LinesTask7 {
    public static void main(String[] args) {
        String f = getString();
        fistA(f);
    }

    private static String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку с буквой 'а' в любом слове.");
        String text = scan.nextLine();
        scan.close();
        return text;
    }

    private static int fistA(String s) {
        int a = s.indexOf('а');
        System.out.println(a);
        return a;
    }

}
