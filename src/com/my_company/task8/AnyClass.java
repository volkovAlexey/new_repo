package com.my_company.task8;

import java.util.*;

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

    public List<String> getUniqueBySet(List<String> strings) {
        return new ArrayList<>(new HashSet<>(strings));
    }

    public List<String> getUnique(List<String> strings) {
        List<String> stringList = new ArrayList<>();
        for (String s : strings) {
            if (stringList.isEmpty()) {
                stringList.add(s);
            }
            if (!stringList.contains(s)) {
                stringList.add(s);
            }
        }
        return stringList;
    }
}
