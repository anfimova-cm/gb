package ru.gb.level_one.home.homeworks;

public class HomeworkOne {
    public static void main(String[] args) {
        System.out.println(math_expression(10, 20, 30, 40));   // 207.5
        System.out.println(check_sum(1, 12));                        // true
        System.out.println(check_sum(1, 9));                         // true
        System.out.println(check_sum(1, 2));                         // false
        System.out.println(check_sum(11, 12));                       // false
        System.out.println(is_positive(10));                            // +
        System.out.println(is_positive(0));                             // +
        System.out.println(is_positive(-10));                           // -
        System.out.println(greeting("Пётр"));
        System.out.println(greeting("Иван"));
        System.out.println(is_regular_year(2001));                         // не високосный
        System.out.println(is_regular_year(2004));                         // високосный
        System.out.println(is_regular_year(2100));                         // не високосный
        System.out.println(is_regular_year(2400));                         // високосный
    }

    /*
    Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
    где a, b, c, d – целочисленные входные параметры этого метода;
     */

    public static float math_expression(int a, int b, int c, int d) {
        return (a * (b + (c / (d * 1f))));
    }

    /*
    Написать метод, принимающий на вход два целых числа, и проверяющий,
    что их сумма лежит в пределах от 10 до 20(включительно),
    если да – вернуть true, в противном случае – false;
     */

    public static boolean check_sum(int a, int b) {
        return ((a + b) >= 10 && (a + b) <= 20);
    }

    /*
    Написать метод, которому в качестве параметра передается целое число,
    метод должен проверить положительное ли число передали, или отрицательное.
    Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    */

    public static boolean is_positive(int a) {
        return  (a >= 0);
    }

    /*
    Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
    */

    public static String greeting(String name) {
        return "Привет, " + name + "!";
    }

    /*
    Написать метод, который определяет является ли год високосным.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    Для проверки работы вывести результаты работы метода в консоль
     */

    public static boolean is_regular_year(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
