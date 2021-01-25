package com.my_company.task14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Collections.synchronizedList(new ArrayList<>());
        Writer writer = new Writer(integers);
        Reader reader = new Reader(integers);

        Thread thread = new Thread(writer);
        Thread thread1 = new Thread(reader);

        thread.start();
        thread1.start();
    }
}
