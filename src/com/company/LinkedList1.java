package com.company;

public class LinkedList1 implements List1 {

    private Node head;
    private int size;


    public LinkedList1() {
        this.head = null;
        this.size = 0;
    }

    private class Node {
        private String value;
        private Node next;

        private Node(String value) {
            this.value = value;
            next = null;
        }
    }

    /**
     * @param data - the data is entered by the user;
     */
    @Override
    public void add(String data) {
        Node newNode = new Node(data);
        Node current = head;
        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    /**
     * @param index - this index is need remove;
     */
    @Override
    public void remove(int index) {
        Node currentNode = head;
        Node previous = null;
        int indexValue = 0;
        while (currentNode.next != null) {
            if (indexValue == index) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previous.next = currentNode.next;
                }
            }
            previous = currentNode;
            currentNode = currentNode.next;
            indexValue++;
        }
    }

    /**
     * @param index - the index is entered by the user.
     * @return - inside in the index.
     */
    @Override
    public String get(int index) {
        Node currentNode = head;
        int indexValue = 0;
        while (currentNode.next != null) {
            if (indexValue == index) {
                return currentNode.value;
            }
            currentNode = currentNode.next;
            indexValue++;
        }
        if (indexValue == index) {
            return currentNode.value;
        }
        return null;
    }

    /**
     * @return - number of filled elements;
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @param index - the index to be changed;
     * @param data  -  the element to be replaced;
     */
    @Override
    public void set(int index, String data) {
        Node currentNode = head;
        int indexValue = 0;
        while (currentNode.next != null) {
            if (indexValue == index) {
                currentNode.value = data;
            }
            currentNode = currentNode.next;
            indexValue++;
        }
        if (indexValue == index) {
            currentNode.value = data;
        }
    }

    public void print() {
        Node newNode = head;

        while (newNode != null) {
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }
}
