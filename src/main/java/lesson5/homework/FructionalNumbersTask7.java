package lesson5.homework;

import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *  Тема: Работа с дробными числами и преобразование типов.
 *   Задеча 7: Ввести цену товара(double) и сумму ваших денег(double). Определит какое целое кол-во товаров
 *             можно купить и какая будет сдача.
 */
public class FructionalNumbersTask7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цену товара.");
        double price = scan.nextDouble();
        System.out.println("Введите сумму ваших денег.");
        double money = scan.nextDouble();
        scan.close();
        double a = money / price;
        int parchaeses = (int) a;
        System.out.println("Количество товара: "+parchaeses);
        float rest =(float) (money - price * parchaeses);  // Здесь float, чтоб не было сильно длинного числа(например: 5,95673312)
        System.out.println("Сдача будет: "+rest);
    }
}