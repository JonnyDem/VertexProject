package lesson4.homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ваня on 13.07.2017.
 */
public class RandomChoise {

    public static String[] hobbyes = {"Love", "Peace", "Sport", "Football", "Java"};
    public static int[] arrayOfnumbers = {12, 34, 25, 67, 89, 49, 26, 385, 678};

    public static void main(String[] args) {
        choiseOfMethods();

    }

        private static void choiseOfMethods() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your choise: from 1 to 5.");
        int choise = scan.nextInt();
        if (choise == 1) {
            addSmile(hobbyes);
        } else {
            if (choise == 2) {
                randomAdding(arrayOfnumbers);
            } else if (choise == 3) {
                lengthOfArray();
            } else if (choise == 4) {
                setUsers();
            } else if (choise == 5) {
                arrayOfUsers();
            } else {
                System.out.println("Please,choose from 1 to 5!");
            }
        }
    }


    private static void addSmile(String[]array) {
        for (int i = 0; i <array.length ; i++) {
            array[i] += "-:)";
        }
        System.out.println(Arrays.toString(array));
    }




    private static void randomAdding(int[]array) {
        System.out.print("Before random adding: ");
        System.out.println(Arrays.toString(arrayOfnumbers));
        Random random = new Random();
        for (int i = 0; i <array.length ; i++) {
            int x = random.nextInt(100);
            array[i] += x;
        }
        System.out.print("After random adding: ");
        System.out.println(Arrays.toString(array));
    }


    private static void lengthOfArray() {
        Random random = new Random();
        int a = random.nextInt(100);
        int[] array = new int[a];
        int index = 0;
        for (int i = 0; i <a ; i++) {
            int x = random.nextInt(100);
            array[i] = x;
        }
        for (int j : array) {
            System.out.println(array[index]);
            index++;
        }
    }
    private static void setUsers(){
        User bob = new User();
        User alex = new User();
        User john = new User();

        bob.setName("Bob");
        alex.setName("Alex");
        john.setName("John");

        bob.setUsername("Collin");
        alex.setUsername("Getter");
        john.setUsername("Setter");

        bob.setLikeCoding(true);
        alex.setLikeCoding(false);
        john.setLikeCoding(true);

        User users[] = new User[3];
        users[0] = bob;
        users[1] = alex;
        users[2] = john;

        for (int i = 0; i <users.length ; i++) {
            System.out.println("Name:" + users[i].getName());
            System.out.println("Surname: " + users[i].getUsername());
            System.out.println("Does he like coding: " + users[i].isLikeCoding());
            System.out.println();
        }

    }
    private static void arrayOfUsers(){
        User vasya = new User();
        User petya = new User();
        User kolya = new User();

        vasya.setName("Vasya");
        petya.setName("Petya");
        kolya.setName("Kolya");

        String[] users = new String[3];
        users[0] = vasya.getName();
        users[1] = petya.getName();
        users[2] = kolya.getName();

        System.out.println(Arrays.toString(users));
    }

}



