package lesson3.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ваня on 08.07.2017.
 */
public class Ex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of elements of array");
        int n = scan.nextInt();

        int[] array = new int[n];

        for (int i = 0; i <array.length ; i++) {
            Random ran = new Random();
            int s = ran.nextInt(100);
            array[i] = s;
        }


        System.out.println("Enter 'find' number");
        int find = scan.nextInt();

        int check = 0;
        int a = 0;

        for (int i = 0; i <array.length ; i++) {
            if (find == array[i]) {
                a++;
                check = 1;
            }
        }
        if (a > 0) {
            System.out.println("Yes,this element appeard in the array " + a + " times");
        }
        else  if (check == 0) {
            System.out.println("No, this element is absent ");
        }
        System.out.println();

        System.out.println(Arrays.toString(array));
    }
}
