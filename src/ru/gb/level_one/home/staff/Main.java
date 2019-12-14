package ru.gb.level_one.home.staff;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee employee0 = new Employee("Василий", "Иванов",
                "инженер", 79992223344L, 10000, 35);
        System.out.println(employee0.getName() + " " + employee0.getSurname() + ", " + employee0.getPosition());

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иван", "Романов", "специалист",
                78889997766L, 10000, 30);
        employees[1] = new Employee("Роман", "Романов", "специалист",
                78889997766L, 10000, 35);
        employees[2] = new Employee("Семён", "Романов", "специалист",
                78889997766L, 10000, 40);
        employees[3] = new Employee("Виктор", "Романов", "специалист",
                78889997766L, 10000, 45);
        employees[4] = new Employee("Анатолий", "Романов", "специалист",
                78889997766L, 10000, 50);
        System.out.println("Сотрудники старше 40: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40)
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + ", "
                        + employees[i].getAge());
        }

        System.out.println("Сотрудники старше 45 с повышенной зп");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 45) {
//                employees[i].raiseSalary(10000);
                int salary = employees[i].getSalary() + 10000;
                employees[i].setSalary(salary);
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + ", "
                        + employees[i].getAge() + ", " + employees[i].getSalary());
            }
        }

        Employee employeeId = new Employee(1, "Светлана");
    }

}
