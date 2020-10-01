package com.ahy231;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> items = new ArrayList<>();

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            items.add(r.nextInt(100));
        }

        System.out.println("排序前：");
        System.out.println(items);

        items.sort((o1, o2) -> o1 < o2 ? -1 : 1);

        System.out.println("排序后");
        System.out.println(items);
    }
}
