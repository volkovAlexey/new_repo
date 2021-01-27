package com.my_company.task14;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class Reader implements Runnable {
    private List<Integer> list;

    Reader(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1_000);
                if (!list.isEmpty()) {
                    Iterator<Integer> iterator = list.iterator();
                    while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                        iterator.remove();
                    }
                } else {
                    LocalDate date = LocalDate.now();
                    System.out.println(date + " - The list is empty");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
