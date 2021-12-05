package com.company;


public class ArrayList1 implements List1 {

    private String[] array;
    private int fillingArray;

    public ArrayList1() {
        this.array = new String[10];
    }

    /**
     * @param size - the size is entered by the user
     */
    public ArrayList1(int size) {
        this.array = new String[size];
    }

    /**
     * @param name - the name is entered by the user;
     */
    @Override
    public void add(String name) {
        // сделать проверки, если массив полон, увеличить его в двое (не исп увеличение массива на +1)
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = name;
                fillingArray++;
                return;
            } else {
                if (array[array.length - 1] != null) {
                    String[] temp = array;
                    this.array = new String[temp.length * 2];
                    System.arraycopy(temp, 0, array, 0, temp.length);
                }
            }
        }
    }

    @Override
    public void remove(int index) {
        String[] temp = array;
        this.array = new String[temp.length - 1];
        System.arraycopy(temp, 0, array, 0, index);
        System.arraycopy(temp, index + 1, array, index, array.length - 1);
        fillingArray--;
    }

    /**
     * @param index - the index is entered by the user.
     * @return - inside in the index.
     */
    @Override
    public String get(int index) {
        return array[index];
    }

    /**
     * @return - number of filled elements;
     */
    @Override
    public int size() {
        return fillingArray;
    }

    /**
     * @param index - the index to be changed
     * @param name  - the element to be replaced;
     */
    @Override
    public void set(int index, String name) {
        array[index] = name;
    }

    public void print() {
        for (String s : array) {
            System.out.println(s);
        }
    }
}
