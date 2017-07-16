package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Методы.
 *  Задача 5. Написать простой калькулятор.
 *            - метод int getInt(), считывающий с консоли целое число и возвращающий его.
 *            -метод char getOperation(), считывающий с консоли какое-то значение и возвращающий символ с операцией
 *            (+,-,*, или /)
 *            - метод int calc(int a, int b, char p), выполняя над числами a и b арифметическую операцию, заданную р.
 *            -метод main считывает два числа (с помощью getInt()), считать операцию (с помощью getOperation()),
 *            передать все методу calc и вывести на экран результат.
 */
public class MethodsTask5 {
    public static int getInt(){
        System.out.println("Enter some number");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        return n;
    }
    public static char getOperation(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some operation");
        String a = scan.next();
        char s ;
        if(a.equals("-")){
            s = '-';
            return s;
        }else if(a.equals("+")){
            s = '+';
            return s;
        }
        else if(a.equals("*")){
            s = '*';
            return s;
        }else if(a.equals("/")){
            s = '/';
            return s;
        }else {
            System.out.println("This operation is not avalable");
            s=' ';
            return s;
        }

    }
    public static int calc(int a,int b,char s){
        int res = 0;
        if(s=='+'){
            res = a + b;
        }else if(s=='-'){
            res=a-b;
        }else if(s=='*'){
            res=a*b;
        }else if(s=='/'){
            res = a / b;
        }
        System.out.println("The result is: "+res);
        return res;

    }

    public static void main(String[] args) {

        int c = calc(getInt(), getInt(), getOperation());
    }

}
