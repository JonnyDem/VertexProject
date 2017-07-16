package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 17.07.2017.
 * Тема: Работа со строками.
 *   Задача 6: Написать метод, принимающий в качестве параметра 2 строки s и s1. Определить входит ли строка s
 *             в строку s1.(являеться ли s подстрокой s1). Метод должен вернуть значение boolean. (true-если входит).
 */
public class LinesTask6 {

    public static void main(String[] args) {
        String v = getString();
        String n = getString();

        isPartOfStringsEquel(v,n);
    }

    private static String getString() {
        Scanner scan = new Scanner(System.in);
        int index = 0;
        String text;
        if (index == 0) {
            System.out.println("Введите первую строку.");
            text = scan.nextLine();
            index++;
            return text;
        } else {
            System.out.println("Введите вторую строку.");
            text = scan.nextLine();
            scan.close();
            return text;
        }
    }

    public static boolean isPartOfStringsEquel(String a,String b) {
        boolean c;
        if (a.indexOf(b) >= 0) {
            c = true;
            System.out.println("Да, вторая строка входит в первую.");
        } else {
            c = false;
            System.out.println("Нет, вторая строка не входит в первую.");
        }
        System.out.println(c);
        return c;
    }
}
