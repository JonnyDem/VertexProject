package lesson5.homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ваня on 16.07.2017.
 *    Тема: Списки.
 *        Задачи: 4, 5, 6. (Я их объеденил, потому что одна задача связана с другой )
 *        Задача 4: Написать метод заполнения списка случайными целыми числами от 0 до 100. Метод принимает список и количество елементов.
 *        Задача 5: Метод который выводит список на экран. Формат вывода: [0]=10;
 *                                                                        [1]=20;
 *                                                                        [2]=30;
 *        Задача 6: Метод, который ищет элемент в списке м возващает кол-во этих елементов. Принимает список и искомый элемент.
 *
 */
public class ListsTask_4_5_6 {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<Integer>();

        fillArray(list,sekectAmmountOfElements());     // Метод заполнения списка случайними (от 0 до 100) цыфрами.(Задача 4).
        showList(list);                                // Метод, который выводит список на экран. (Задача 5).
        findElement(list,selectElement());             // Метод, который ищет елемент в списке. (Задача 6).
    }

    private static int selectElement() {
        System.out.println("Введите елемент, который вы хотите найти.");
        int e = scan.nextInt();
        scan.close();
        return e;
    }

    private static int findElement(ArrayList<Integer>list,Integer element) {   // Метод, который ищет елемент в списке. (Задача 6).
        int count=0;

        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i) == element) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Да, такой елемент есть в списке.");
            System.out.println("Количество таких елементов в списке: " + count);
        } else {
            System.out.println("Нет, такого элемента нет в списке");
        }
        return count;
       }


    private static void showList(ArrayList<Integer>list) {   // Метод, который выводит список на экран. (Задача 5).
        for (int i = 0; i <list.size() ; i++) {
            System.out.println("[" + i + "]=" + list.get(i));
        }
    }

    private static int sekectAmmountOfElements() {
        System.out.println("Введите количество елементов для списка.");
        int s = scan.nextInt();
        return s;
    }

    private static ArrayList<Integer> fillArray(ArrayList<Integer>list,int quantity) {  // Метод заполнения списка случайними (от 0 до 100) цыфрами.(Задача 4).
        Random random = new Random();
        for (int i = 0; i <quantity ; i++) {
            int r = random.nextInt(101);
            list.add(r);
        }
        return list;
    }
}
