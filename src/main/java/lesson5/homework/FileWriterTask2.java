package lesson5.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Ваня on 14.07.2017.
 * Тема: Потоки ввода/вывода FileWriter, FileReader.
 *    Задача 2: Написать метод, который принимает имя файла и возвращает количество строк в файле.
 *       (Я написал еще один метод с помощью которого вводиться имя файла с консоли).
 *       И еще перед проверкой этого метода надо создать текстовый файл и поместить его где содержиться проэкт(Куда IDEA записывает все файлы)
 *       А если не хочешь созавать свой файл, разкоментируй метод buildSomeFile() в мейне.
 *
 */
public class FileWriterTask2 {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)throws Exception {

        // buildSomeFile();                                  // Этод метод создает файл.Если не хочешь создавать свой файл, можешь запустить этот метод.
        countOfLines(enterNameOfFile());
    }

    private static String enterNameOfFile() {           // Метод который возвращает имя файла.
        System.out.println("Введите имя файла который вы создали!");
        String fileName = scan.nextLine();
        scan.close();
        return fileName;
    }
    private static int countOfLines(String fileName)throws Exception {   // Метод который возвращает количество строк в файле.
        FileReader fr = new FileReader(fileName+".txt");
        Scanner scan = new Scanner(fr);
        int count = 0;
        while (scan.hasNextLine()){
            String s1 = scan.nextLine();
            count++;
        }scan.close();
        System.out.println("Количество строк в файле: "+count);
        return count;
    }
    private static void buildSomeFile() throws Exception {                  // Метод который созвает файл.
        System.out.println("Введите имя файла который вы хотите создать.");
        String s = scan.nextLine();

        System.out.println("Введите количество строк которые вы хотите создать в созданом файле.");
        int lines = scan.nextInt();

        String lieString = scan.nextLine(); // Эта строка нужна для того чтоб nextInt() не перепрыгивал через nextLine()(Эта строка не исполняеться)
                                            // Можешь ее убрать и увидишь что будет.
        FileWriter fw=new FileWriter(s+".txt");
        for (int i = 1; i <= lines;  i++) {
               System.out.println("Введите любой текст для " + i + "-й строки для созданного файла");
                String text = scan.nextLine();
                fw.write(text + "\n");
        }
        fw.close();
    }
}
