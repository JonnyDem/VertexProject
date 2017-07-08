package lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 08.07.2017.
 */
public class FilingArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int[]array=new int[10];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("Введите "+i+"-й элемент массива");
            int a=scan.nextInt();
            array[i]=a;
        }
        System.out.println(Arrays.toString(array));
    }
}
