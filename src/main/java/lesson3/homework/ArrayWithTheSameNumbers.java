package lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 08.07.2017.
 */
public class ArrayWithTheSameNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of array");
        int a = scan.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
        }
        System.out.println(Arrays.toString(array));

    }
}
