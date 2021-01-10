package com.my_company.task8;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> strings = new LinkedList<>();
        strings.add("1");
        strings.add("333332");
        strings.add("3333");
        strings.add("4");

        AnyClass anyClass = new AnyClass();

        System.out.println(anyClass.reverseQueue(strings));
        System.out.println(anyClass.removeLongElements(strings));
    }
}
