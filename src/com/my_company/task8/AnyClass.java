package com.my_company.task8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class AnyClass {

    public Queue<String> reverseQueue(Queue<String> strings) {
        Deque<String> strings1 = new ArrayDeque<>(strings);
        Queue<String> strings2 = new ArrayDeque<>();
        while (!strings1.isEmpty()) {
            strings2.add(strings1.pollLast());
        }
        return strings2;
    }

    public Queue<String> removeLongElements(Queue<String> strings) {
        Queue<String> strings1 = new LinkedList<>();
        for (String temp : strings) {
            if (temp.length() <= 4) {
                strings1.add(temp);
            }
        }
        return strings1;
    }
}
