package com.company;

public class LinkedList1 implements List1 {

    private LinkList head;
    private LinkList last;


    public LinkedList1() {
        this.head = null;
    }

    private class LinkList {
        String value;
        LinkList next;
        int index;

        private LinkList(String value) {
            this.value = value;
            next = null;
        }
    }

    @Override
    public void add(String data) {
        LinkList newNode = new LinkList(data);
        last.next = newNode;
    }

    @Override
    public void remove(int index) {
        LinkList currentNode = head;
        LinkList previous = null;
        while (currentNode.next != null) {

           // if (currentNode.value == head) {
                if (currentNode == head) {
                    head = head.next;
                } else {
                    previous.next = currentNode.next;
                }
            }
            previous = currentNode;
            currentNode = currentNode.next;
        }
   // }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void set(int index, String e) {

    }

    public void print() {
        LinkList newNode = head;

        while (newNode != null) {
            System.out.println(newNode.value);
            newNode = newNode.next;
        }
    }
}
