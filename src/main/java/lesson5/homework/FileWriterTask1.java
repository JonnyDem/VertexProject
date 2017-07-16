package lesson5.homework;

import java.io.FileWriter;

/**
 * Created by Ваня on 14.07.2017.
 * Тема: Потоки ввода/вывода FileWriter, FileReader.
 *    Задача 1:  Написать метод, который заполняет файл четными чилсами от k1 до k2.
 *               Все числа в отдельной строке.
 *               Этот метод принимает  имя файла, k1 и k2 в качестве параметра.
 */
public class FileWriterTask1 {
    public static void main(String[] args)throws Exception {
        String sfileName="file2.txt";
        int k1=10;
        int k2=30;
        myMethods(sfileName,k1,k2);
    }

    private static void myMethods(String sfileName, int k1, int k2)throws Exception {   // Сам метод.
        FileWriter fw=new FileWriter(sfileName);
        if(k1%2==0) {
            for (int i = k1; i <= k2; i += 2) {
                fw.write(i + "\n");
            }
            fw.close();
        }else{
            for (int i = k1+1; i <= k2; i += 2) {
                fw.write(i + "\n");
            }
        }fw.close();
    }
}
