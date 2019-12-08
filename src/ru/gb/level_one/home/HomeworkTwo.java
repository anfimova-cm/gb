package ru.gb.level_one.home;

import java.util.Arrays;

public class HomeworkTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceOneAndZero()));
        System.out.println(Arrays.toString(fillArray()));
        System.out.println(Arrays.toString(doubleLessSix()));
        System.out.println(Arrays.toString(searchMinAndMax()));
        fillDiagonal(5);
        System.out.println(Arrays.toString(offset(new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}, 2)));
    }

    /*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    */

    public static int[] replaceOneAndZero() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] == 1) arr[i] = 0;
                else arr[i] = 1;
        }
        return arr;
    }

    /*
    2 Задать пустой целочисленный массив размером 8.
    Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    */

    public static int[] fillArray() {
        int[] arr = new int[8];
        for (int i = 1; i < arr.length; i ++) {
            arr[0] = 1;
            arr[i] = arr[i - 1] + 3;
        }
        return arr;
    }

    /*
    3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
    */

    public static int[] doubleLessSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] < 6) arr[i] *= 2;
                else arr[i] = arr[i];
        }
        return arr;
    }

    /*
    4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    */

    /*
    Как сделать, чтоб при условии arr[i] < min заработало, не поняла
    */

    public static int[] searchMinAndMax() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > max) max = arr[i];
            else min = arr[i];
        }
        return new int[] {min, max};
    }

    /*
    5 Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    заполнить его диагональные элементы единицами, используя цикл(ы);
    */

    public static int[][] fillDiagonal(int a) {
        int[][] arr = new int[a][a];
        for (int i = 0; i < a; i ++) {
            for (int j = 0; j < a; j ++) {
                if (i == j) arr[i][j] = 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    /*
    6 Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
    checkBalance ([10, || 1, 2, 3, 4]) → true.
    Абстрактная граница показана символами ||, эти символы в массив не входят.
    */

    /*
    7 Написать метод, которому на вход подаётся одномерный массив и число n
    (может быть положительным, или отрицательным),
    при этом метод должен циклически сместить все элементы массива на n позиций.
    */

    /*
    С n < 0 и n > arr.length не получилось
     */

    public static int[] offset(int[] arr, int n) {
        int[] offsetArr = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            if (n >= 0) {
                if ((i + n) < arr.length) offsetArr[i] = arr[i + n];
                else offsetArr[i] = arr[i + n - arr.length];
            }
//            if (n < 0) {
//                if ((i - n) < arr.length)  offsetArr[i] = arr[arr.length + n + i];
//                else offsetArr[i] = arr[i - n - arr.length];
//            }
        }
        return offsetArr;
    }

    /*
    8 Не пользоваться вспомогательным массивом при решении задачи 7.
     */
}
