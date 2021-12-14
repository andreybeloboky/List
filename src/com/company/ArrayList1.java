package com.company;


public class ArrayList1 implements List1 {

    private String[] array;
    private int listSize = 0;

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
     * @param data - the data is entered by the user;
     */
    @Override
    public void add(String data) {
        if (listSize == array.length) {
            createNewArray();
        }
        array[listSize] = data;
        listSize++;
    }

    /**
     * @param index - who needs remove;
     */
    @Override
    public void remove(int index) {
        for (int i = index; i < listSize; i++) {
            array[index] = array[index + 1];
            index++;
        }
        if (listSize * 2 < array.length) {
            decreaseArray();
        }
        listSize--;
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
        return listSize;
    }

    /**
     * @param index - the index to be changed
     * @param data  - the element to be replaced;
     */
    @Override
    public void set(int index, String data) {
        array[index] = data;
    }

    private void createNewArray() {
        String[] temp = array;
        this.array = new String[temp.length * 2];
        System.arraycopy(temp, 0, array, 0, temp.length);
    }

    public void decreaseArray() {
        String[] temp = array;
        this.array = new String[array.length - 10];
        System.arraycopy(temp, 0, array, 0, array.length);
    }
}
