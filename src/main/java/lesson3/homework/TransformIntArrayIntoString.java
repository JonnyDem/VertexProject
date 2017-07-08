package lesson3.homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Ваня on 08.07.2017.
 */
public class TransformIntArrayIntoString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] array = new int[4];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Enter "+i+"-th element of array");
            int a = scan.nextInt();
            array[i] = a;
        }
        System.out.println();
        System.out.print("It's array in int form:  ");
        System.out.println(Arrays.toString(array));

        String[] stringArray = new String[array.length];

        for (int i = 0; i <stringArray.length ; i++) {
            stringArray[i] = String.valueOf(array[i]);
        }
        System.out.println();
        System.out.print("It's array in string form:  ");
        System.out.println(Arrays.toString(stringArray));
    }
}
