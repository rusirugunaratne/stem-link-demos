package org.example.linkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // O(1)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // O(1)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if(tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // O(n)
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if(position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if(current == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;

        if(current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
    }

    // delete from beginning
    // delete from end
    // search
    // update
    // get size
    // is empty
    // print list

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int value) {
            this.data = value;
            this.next = null;
            this.prev = null;
        }
    }
}
