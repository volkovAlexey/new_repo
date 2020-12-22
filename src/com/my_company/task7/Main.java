package com.my_company.task7;

public class Main {
    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        Recursion recursion = new Recursion();
//        recursion.printArrByRecursion(arr);

        ListImpl list = new ListImpl();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(4);
        list.push(4);
        list.push(4);
        list.push(4);
        list.push(4);
        list.push(4);
        list.push(4);
        list.push(4);

        System.out.println(list.peek());
        System.out.println(list.pop());
        System.out.println(list.peek());
    }
}
