package com.my_company.task9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("asas", 1);
        map.put("fdf", 2);
        map.put("gdv", 3);
        map.put("as", 4);
        map.put("cvc", 5);
        MapPractice mapPractice = new MapPractice();

        System.out.println(mapPractice.inversionKey(map));
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        List<String> strings = mapPractice.frequentStrings(str);
        System.out.println(strings);
    }
}
