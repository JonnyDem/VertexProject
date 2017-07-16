package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Методы.
 *  Задача 2. Написать метод getMax, который принимает два целых числа и возвращает максимальное.
 *            В main считать два целых числа, передать методу getMax и вывести результат на экран.
 */
public class MethodsTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1-th number");
        int a = scan.nextInt();
        System.out.println("Enter 2-th number");
        int b = scan.nextInt();
        getMax(a,b);
        scan.close();

    }
    public static int getMax(int a,int b){

        if(a > b){
            System.out.println(a);
        return a;
        }
        else if(b > a){
            System.out.println(b);
            return b;
        }else{
            System.out.println("This nambers are equel");
            return 0;
        }

    }

}
