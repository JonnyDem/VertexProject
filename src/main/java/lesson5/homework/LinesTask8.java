package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 17.07.2017.
 * Тема: Работа со строками.
 *   Задача 8: Написать метод, принимающий в качестве параметра строку. Возращающий перевернутую строку.
 */
public class LinesTask8 {
    public static void main(String[] args) {

        String a = getString();
        stringBackwords(a);
    }

    private static String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку.");
        String text = scan.nextLine();
        scan.close();
        return text;
    }

    private static String stringBackwords(String s) {
       int index = 0;
        char[] backwordWord = new char[s.length()];
        for (int i = s.length()-1; i >= 0 ; i--) {
            backwordWord[index] = s.charAt(i);
            index++;
        }
        String target = new String(backwordWord);
        System.out.println(target);
        return target;
    }
}
