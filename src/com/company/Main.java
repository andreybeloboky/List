package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List1 list = new ArrayList1();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("3");
        list.add("3");
        list.remove(1);
        list.remove(2);
        list.remove(3);
        System.out.println(list.size());

    }
}
