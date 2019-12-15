package ru.gb.level_one.home.staff;

public class Employee {

    /*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
    2. Конструктор класса должен заполнять эти поля при создании объекта;
    3. Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    4. Вывести при помощи методов из пункта 3 ФИО и должность.
    5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
    6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    7. *** Продумать конструктор таким образом, чтобы при создании каждому сотруднику присваивался
     личный уникальный идентификационный порядковый номер
     */

    private int id;
    private String name;
    private String surname;
    private String position;
    private long phone;
    private int salary;
    private int age;

    public Employee() {
        setId(0);
    }

    public Employee(String name, String surname, String position, long phone, int salary, int age) {
        this();
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public long getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int amount) {
        int salary = getSalary() + amount;
        setSalary(salary);
        return salary;
    }

}
