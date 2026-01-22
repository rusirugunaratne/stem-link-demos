package org.example.queue;

import org.example.exception.QueueOverflowException;
import org.example.exception.QueueUnderflowException;

public class CircularQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) throws QueueOverflowException {
        if(isFull())
            throw new QueueOverflowException("Queue is full");

        if(isEmpty())
            front = 0;

        // rear 4 | capacity 5 | (rear + 1) % capacity | (4+1) % 5 = 5 % 5 = 0
        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        size++;
    }

    public int dequeue() throws QueueUnderflowException {
        if(isEmpty())
            throw new QueueUnderflowException("Queue is empty");

        int element = queueArray[front];

        if(front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }

        size--;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}
