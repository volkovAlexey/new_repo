package com.my_company.task9;

import java.util.*;

public class MapPractice {

    public Map<Integer, String> inversionKey(Map<String, Integer> map) {
        Map<Integer, String> map1 = new HashMap<>();
        for (Map.Entry<String, Integer> temp : map.entrySet()) {
            map1.put(temp.getValue(), temp.getKey());
        }
        return map1;
    }

    public List<String> frequentStrings(String s) {
        String[] array = s.split(" ");
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, array);

        Map<String, Integer> map = new HashMap<>();
        for (String temp : strings) {
            if (map.containsKey(temp)) {
                Integer count = map.get(temp);
                count++;
                map.put(temp, count);
            } else {
                map.put(temp, 1);
            }
        }
        List<Integer> integers = new ArrayList<>(map.values());
        Collections.sort(integers);

        List<Integer> subList = new ArrayList<>();
        subList.add(integers.get(integers.size() - 1));
        subList.add(integers.get(integers.size() - 2));

        List<String> frequent = new ArrayList<>();
        for (Map.Entry<String, Integer> temp : map.entrySet()) {
            if (temp.getValue().equals(subList.get(0)) || temp.getValue().equals(subList.get(1))) {
                frequent.add(temp.getKey());
            }
        }
        return frequent;
    }

}
