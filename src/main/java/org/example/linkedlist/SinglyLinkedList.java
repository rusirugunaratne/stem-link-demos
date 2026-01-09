package org.example.linkedlist;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    // O(1)
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data); //O(1)

        // if list is empty
        if(head == null) {
            head = newNode;
            return;
        } //O(1)

        Node current = head; //O(1)
        while (current.next != null){
            current = current.next;
        } // O(n)

        current.next = newNode; // O(1)
    }

    // O(n)
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if(position == 0) {
            newNode.next = head;
            head = newNode;
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
        current.next = newNode;

    }

    public void deleteFromBeginning(){
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // O(n)
    public void deleteFromEnd(){
        if(isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if(head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }

        current.next = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    // search for a specific value
    // delete from a specific position
    // delete from a specific value
    // update a specific value
    // get a specific value
    // get size
    // is empty
    // print list

    private class Node {
        int data;
        Node next;

        public Node(int value) {
            this.data = value;
            this.next = null;
        }
    }
}
