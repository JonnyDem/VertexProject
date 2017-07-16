package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 17.07.2017.
 * Тема: Работа со строками.
 *   Задача 10: Написать метод, проверяющий являеться ли строка полиндромом. Строка которая одинаково читаеться справа
 *             налево и слева направо (дед).
 */
public class LinesTask10 {
    public static void main(String[] args) {

        String a=getString();
        isStringPolindrom(a);
    }

    private static String getString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scan.nextLine();
        scan.close();
        return text;
    }

    public static boolean isStringPolindrom(String s) {
        boolean check;
        char[] word = new char[s.length()];
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            word[index] = s.charAt(i);
            index++;
        }
        String target = new String(word);
        if(s.equals(target)){
            check = true;
            System.out.println("Да, эта строка полиндром");
        }else{
            check = false;
            System.out.println("Нет, эта строка не полиндром");
        }
        System.out.println(check);
        return check;
    }
}
