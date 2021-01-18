package com.my_company.task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(10.1);
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(4.0);
        System.out.println(sum(numbers));

        Employee employee1 = new Employee("Alexey", "Volkov", 4000);
        Employee employee2 = new Employee("Alexey", "Smirnov", 500);
        Employee employee3 = new Employee("Maxim", "Kovalev", 4000);
        Employee employee4 = new Employee("Denis", "Volkov", 3000);
        Employee employee5 = new Employee("Olexandr", "Ivanov", 4000);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        Collections.sort(employees);
        System.out.println(employees);
        System.out.println("-------------");

        Comparator<Employee> sortEmployeeBySalary  = new SortEmployeeBySalary();
        Collections.sort(employees, sortEmployeeBySalary);
        System.out.println(employees);
    }

    private static <T extends Number> double sum(List<T> list) {
        double sum = 0.0;
        for (T temp : list) {
            sum += temp.doubleValue();
        }
        return sum;
    }
}
