package lesson5.homework;

/**
 * Created by Ваня on 14.07.2017.
 * Задача 3. Тема: Двумерные массивы.
 *   Написать метод принимающий двухмерный квадратный массив и заполняющий:  01, 02, 03, 04
 *                                                                           08, 07, 06, 05
 *                                                                           09, 10, 11, 12
 *                                                                           16, 15, 14, 13
 */
public class SquareArrayTask3 {
    public static void main(String[] args) {

        String[][] array = new String[4][4];
        fillArray(array);


    }

    private static void showArray(String[][]array) {         //Метод показывающий массив на экран
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    private static void fillArray(String[][]array) {           // Метод заполняющий массив
        int number = 1;
        String b = "0";
        for (int i = 0; i <array.length ; i++) {
            if (i%2==0){
                for (int j = 0; j < array[i].length; j++) {
                    if (number < 10) {
                        array[i][j] = b + number;
                        number++;
                    } else {
                        array[i][j] = String.valueOf(number);
                        number++;
                    }
                }
            }else {
                for (int j = array[i].length-1; j>=0; j--) {
                    if (number < 10) {
                        array[i][j] = b + number;
                        number++;
                    } else {
                        array[i][j] = String.valueOf(number);
                        number++;
                    }
                }
            }
        }
        showArray(array);
    }
}
