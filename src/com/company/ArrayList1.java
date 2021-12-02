package com.company;

import java.util.Arrays;

public class ArrayList1 implements List1 {

    private String[] array;

    public ArrayList1() {
        this.array = new String[10];
        Arrays.fill(array, "1");
    }

    public ArrayList1(int size) {
        this.array = new String[size];
        Arrays.fill(array, "1");
    }

    @Override
    public void add(String name) {
        String[] temp = array;
        this.array = new String[temp.length + 1];
        System.arraycopy(temp, 0, array, 0, temp.length);
        array[array.length - 1] = name;
    }

    @Override
    public void delete(int index) {
        array[index] = null;

    }

    @Override
    public String get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public void set(int index, String e) {
        array[index] = e;
    }
}
