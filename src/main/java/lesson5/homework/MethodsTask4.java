package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Методы.
 *  Задача 4. Написать не возвращающий метод, который принимает в качестве параметра числа k и n (k больше n).
 *            Этот метод выводит все четные числа от k до n на экран.
 *            В main считать два числа и передать этому методу.
 *
 */
public class MethodsTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1-th number");
        int a = scan.nextInt();
        System.out.println("Enter 2-th number");
        int b = scan.nextInt();
        scan.close();

        checkNumbers(a,b);
    }

    public static void checkNumbers(int k,int n){
        if( k > n){
            while (n <= k) {
                if (n % 2 == 0) {
                    System.out.print(n + ",");
                }
                n++;
            }
        } else if (n > k) {
            while (k <= n) {
                if (k % 2 == 0) {
                    System.out.print(k + ",");
                }
                k++;
            }
        } else {
            System.out.println("This numbers are equel");
        }
    }
}
