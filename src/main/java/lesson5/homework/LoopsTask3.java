package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Цыклы.
 * Задача 3: Считать с клавиатуры числа k и n. (вводим k меньше n). Вывести на экран с помощью цыкла while,
 *           числа от k до n.
 */
public class LoopsTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число k");
        int k = scan.nextInt();
        System.out.println("Введите число n");
        int n = scan.nextInt();
        while(k<=n){
            System.out.println(k);
            k++;
        }
        scan.close();
    }
}
