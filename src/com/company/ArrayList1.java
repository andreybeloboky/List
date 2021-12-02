package com.company;

import java.util.Arrays;

public class ArrayList1 implements List1 {

    private String[] array;

    public ArrayList1() {
        this.array = new String[10];
        Arrays.fill(array, "1");
    }

    /**
     * @param size
     */
    public ArrayList1(int size) {
        this.array = new String[size];
        Arrays.fill(array, "1");
    }

    /**
     * @param name
     */
    @Override
    public void add(String name) {
        String[] temp = array;
        this.array = new String[temp.length + 1];
        System.arraycopy(temp, 0, array, 0, temp.length);
        array[array.length - 1] = name;
    }

    @Override
    public void delete(int index) {
        String[] temp = array;
        this.array = new String[temp.length - 1];
        System.arraycopy(temp, 0, array, 0, index);
        System.arraycopy(temp, index + 1, array, index, array.length - 1);
    }

    /**
     * @param index
     * @return
     */
    @Override
    public String get(int index) {
        return array[index];
    }

    /**
     * @return
     */
    @Override
    public int size() {
        return array.length;
    }

    /**
     * @param index
     * @param name -
     */
    @Override
    public void set(int index, String name) {
        array[index] = name;
    }
}
