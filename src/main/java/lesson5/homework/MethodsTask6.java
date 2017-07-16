package lesson5.homework;

import java.util.Arrays;

/**
 * Created by Ваня on 16.07.2017.
 * Тема: Методы.
 *  Задача 6: Написать метод заполнения массива случайными числами от 0 до 100.
 *            Метод вывода на экран.
 *            Метод вывода части массива, который принимает в качестве параметров: массив, индекс элемента с которого
 *            выводить и индекс элемента по который вводить.
 *            Метод, который принимает в качестве параметра массив и возвращает его размер.
 *            Главный метод.
 */
public class MethodsTask6 {
    public static void main(String[] args) {
        int[]vector=new int[14];
        fillVector(vector);
        printVecor(vector);
        printPartVector(vector,2,7);
        System.out.println("size = "+getSizeVecor(vector));
    }

    private static void fillVector(int[] vect) {
        for (int i = 0; i <vect.length ; i++) {
            vect[i]=(int)(100*Math.random());
        }
    }

    private static void printVecor(int[] vect) {
        System.out.println(Arrays.toString(vect));
    }

    private static void printPartVector(int[] vect, int indexBegin, int indexEnd) {
        for (int i = indexBegin; i <=indexEnd ; i++) {
            System.out.println(i+"-й элемент массива: "+vect[i]);
        }
    }

    private static int getSizeVecor(int[] vect) {
        return vect.length;
    }

}
