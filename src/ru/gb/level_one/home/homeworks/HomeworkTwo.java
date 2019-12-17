package ru.gb.level_one.home.homeworks;

import java.util.Arrays;

public class HomeworkTwo {
    public static void main(String[] args) {

        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив из 1 и 0: " + Arrays.toString(arr));
        replaceOneAndZero(arr);
        System.out.println("1 и 0 заменены: " + Arrays.toString(arr));

        int[] arr8 = new int[8];
        fillArray(arr8, 1, 3);
        System.out.println(Arrays.toString(arr8));

        int[] arr2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println("Массив до умножения: " + Arrays.toString(arr2));
        doubleLessSix(arr2);
        System.out.println("Все значения < 6 умножены на 2: " + Arrays.toString(arr2));

        int[] arrToSearch = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив для поиска min и max: " + Arrays.toString(arrToSearch));
        System.out.println("Минимальное значение - " + findMin(arrToSearch));
        System.out.println("Максимальное значение - " + findMax(arrToSearch));

        final int side = 5;
        int[][] arrF = new int[side][side];
        fillDiagonal(arrF);
        for (int i = 0; i < arrF.length; i++) {
            for (int j = 0; j < arrF[i].length; j++) {
                System.out.print(arrF[i][j] + " ");
            }
            System.out.println();
        }

        int[] arrBalance = {0, 31, 7, 1, 23};
        System.out.println("Массив для сравнения сумм сторон: " + Arrays.toString(arrBalance));
        System.out.println("Массив уравновешен? " + checkBalance(arrBalance));

        int[] offsetArr =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Первоначальный массив: " + Arrays.toString(offsetArr));
        offset(offsetArr, 3);
        System.out.println("Массив смещён: " + Arrays.toString(offsetArr));
        offset(offsetArr, -3);
        System.out.println("Массив смещён: " + Arrays.toString(offsetArr));
    }

    /*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
    */

    public static void replaceOneAndZero(int[] arr) {
        for (int i = 0; i < arr.length; i ++)
            arr[i] = (arr[i] == 1) ? 0 : 1;
//            arr[i] ^= 1;
    }

    /*
    2 Задать пустой целочисленный массив размером 8.
    Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    */

    public static void fillArray(int[] arr8, int step, int shift) {
        for (int i = 0; i < arr8.length; i ++)
            arr8[i] = i * step + shift;
    }

    /*
    3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
    */

    public static void doubleLessSix(int[] arr2) {
        for (int i = 0; i < arr2.length; i ++) {
            if (arr2[i] < 6)
                arr2[i] *= 2;
        }
    }

    /*
    4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
    */

    public static int findMin(int[] array) {
        int min = array[0];
        for (int index : array)     // foreach
            if (index < min)
                min = index;
//        for (int i = 0; i < array.length; i ++) {
//            if (array[i] < min) min = array[i];
        return min;
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int index : array)
            if (index > max)
                max = index;
        return max;
    }

    /*
    5 Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
    заполнить его диагональные элементы единицами, используя цикл(ы);
    */

    public static void fillDiagonal(int[][] arrF) {
        for (int i = 0; i < arrF.length; i ++) {
            arrF[i][i] = 1;
            arrF[i][arrF.length - 1 - i] = 1;
        }
    }

    /*
    6 Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false,
    checkBalance ([10, || 1, 2, 3, 4]) → true.
    Абстрактная граница показана символами ||, эти символы в массив не входят.
    */

    public static boolean checkBalance(int[] arrBalance) {
        int right = 0, left = 0;
        for (int i = 0; i < arrBalance.length - 1; i++) {
            left += arrBalance[i];
            for (int j = i + 1; j < arrBalance.length; j++)
                right += arrBalance[j];
            if (left == right) return true;
            right = 0;
        }
        return false;
    }

    /*
    7 Написать метод, которому на вход подаётся одномерный массив и число n
    (может быть положительным, или отрицательным),
    при этом метод должен циклически сместить все элементы массива на n позиций.
    */

    // попробовать написать без веток иф-элс, единым не дублирующимся алгоритмом

    public static void offset(int[] offsetArr, int n) {
        for (int i = 0; i < offsetArr.length; i ++) {
            if (n >= 0) {
                n = n % offsetArr.length;
                if ((i + n) < offsetArr.length) offsetArr[i] = offsetArr[i + n];
                else offsetArr[i] = offsetArr[i + n - offsetArr.length];
            }
            if (n < 0) {
                int nPositive = -n;
                nPositive = nPositive % offsetArr.length;
                if (i < nPositive) offsetArr[i] = offsetArr[offsetArr.length - nPositive + i];
                else offsetArr[i] = offsetArr[i - nPositive];
            }
        }
    }

    /*
    8 Не пользоваться вспомогательным массивом при решении задачи 7.
     */
}
