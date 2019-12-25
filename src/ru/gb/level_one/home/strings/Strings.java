package ru.gb.level_one.home.strings;

import java.io.*;

public class Strings {

    public static void main(String[] args) {

        try {
            createFile("text1.txt", "1 2 3 4 5 ");
            createFile("text2.txt", "6 7 8 9 0");
            appendFiles("text.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void createFile(String fileName, String fileText) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName, false);
        PrintStream ps = new PrintStream(fos);
        ps.print(fileText);
        fos.close();
    }

    public static void appendFiles(String fileName) throws IOException {
        FileInputStream fis1 = new FileInputStream("text1.txt");
        FileInputStream fis2 = new FileInputStream("text2.txt");
        FileOutputStream fos = new FileOutputStream(fileName);
        PrintStream ps = new PrintStream(fos);
        int b1;
        while ((b1 = fis1.read()) != -1) {
            ps.print((char) b1);
        }
        int b2;
        while ((b2 = fis2.read()) != -1) {
            ps.print((char) b2);
        }
        fos.close();
        fis1.close();
        fis2.close();
    }

    /*
    1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом (особого значения не имеет);
    2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
    3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле
    (работаем только с латиницей)
    4. ** Написать метод, проверяющий, есть ли указанное слово в папке
     */

}
