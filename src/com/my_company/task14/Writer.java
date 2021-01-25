package com.my_company.task14;

import java.util.List;
import java.util.Random;

public class Writer implements Runnable {
    private volatile List<Integer> list;

    Writer(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        Random random = new Random();
        while (Thread.currentThread().isAlive()) {
            try {
                Thread.sleep(2_500);
                list.add(random.nextInt());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
