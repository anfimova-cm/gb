package ru.gb.lesson_one.home;

public class HomeworkOne {
    public static void main(String[] args) {
        System.out.println(ex_one(10, 20, 40, 20));      // 220.0
        System.out.println(ex_two(1, 12));                      // true
        System.out.println(ex_two(1, 9));                       // true
        System.out.println(ex_two(1, 2));                       // false
        System.out.println(ex_two(11, 12));                     // false
        ex_three(10);                                               // +
        ex_three(0);                                                // +
        ex_three(-10);                                              // -
        ex_four("Пётр");
        ex_four("Иван");
        ex_five(2001);                                            // не високосный
        ex_five(2004);                                            // високосный
        ex_five(2100);                                            // не високосный
        ex_five(2400);                                            // високосный
    }

    /*
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
     де a, b, c, d – целочисленные входные параметры этого метода;
     */

    public static float ex_one(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    /*
    Написать метод, принимающий на вход два целых числа, и проверяющий,
    что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
     */

    public static boolean ex_two(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Написать метод, которому в качестве параметра передается целое число,
    метод должен проверить положительное ли число передали, или отрицательное.
    Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    */

    public static void ex_three(int a) {
        if (a >= 0) {
            System.out.println(a + " - положительное число");
        } else {
            System.out.println(a + " - отрицательное число");
        }
    }

    /*
    Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
    */

    public static void ex_four(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /*
    Написать метод, который определяет является ли год високосным.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    Для проверки работы вывести результаты работы метода в консоль
     */

    public static void ex_five(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }
}