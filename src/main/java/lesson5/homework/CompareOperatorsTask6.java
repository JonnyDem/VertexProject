package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Операторы сравнения.
 *   Задача 6: Запросить количество лет пользователя. Вывести занятие для его возраста.
 */
public class CompareOperatorsTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько вам лет?");
        int age = scan.nextInt();
        scan.close();
        if (age < 6){
            System.out.println("Вам бы поиграться.");
        }else if(age < 16 && age >=6){
            System.out.println("Вам бы в школу.");
        }else if(age <24 && age >=16){
            System.out.println("Вам бы в университет.");
        }else if(age >= 24 && age <= 60){
            System.out.println("Вам бы на работу");
        }else if(age > 60){
            System.out.println("Вы пенсионер");
        }
    }
}
