package com.my_company.task10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<Double> numbers = new ArrayList<>();
//        numbers.add(10.1);
//        numbers.add(2.0);
//        numbers.add(3.0);
//        numbers.add(4.0);
//        System.out.println(sum(numbers));

        Employee employee1 = new Employee("Alexey", "Volkov");
        Employee employee2 = new Employee("Alexey", "Smirnov");
        Employee employee3 = new Employee("Maxim", "Kovalev");
        Employee employee4 = new Employee("Denis", "Volkov");
        Employee employee5 = new Employee("Olexandr", "Ivanov");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        Collections.sort(employees);
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
