package lesson5.homework;

/**
 * Created by Ваня on 14.07.2017.
 * Задача 2. Тема: Двумерные массивы.
 *   Написать метод принимающий двухмерный квадратный массив и заполняющий:  01, 02, 03, 04
 *                                                                           05, 06, 07, 08
 *                                                                           09, 10, 11, 12
 *                                                                           13, 14, 15, 16
 */
public class SquareArray {
    public static void main(String[] args) {

        String[][] array = new String[4][4];
        fillArray(array);
    }

    private static void fillArray(String[][]array) {
        int number = 1;
        String b = "0";
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (number < 10) {
                    array[i][j] = b + number;
                    number++;
                } else {
                    array[i][j] = String.valueOf(number);
                    number++;
                }
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
