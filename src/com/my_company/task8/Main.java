package com.my_company.task8;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("qwe");
        stringQueue.add("2");
        stringQueue.add("3");
        stringQueue.add("4");

        List<String> strings = new LinkedList<>();
        strings.add("1");
        strings.add("333332");
        strings.add("3333");
        strings.add("4");
        strings.add("4");
        strings.add("4");
        strings.add("3");
        strings.add("1");

        AnyClass anyClass = new AnyClass();

        System.out.println(anyClass.reverseQueue(stringQueue));
        System.out.println(anyClass.removeLongElements(stringQueue));
        System.out.println(anyClass.getUniqueBySet(strings));
        System.out.println(anyClass.getUnique(strings));
    }
}
