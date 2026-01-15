package org.example.queue;

import org.example.exception.QueueOverflowException;
import org.example.exception.QueueUnderflowException;

public class LinearQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int element) throws QueueOverflowException {
        if(isFull())
            throw new QueueOverflowException("The queue is full");

        queueArray[++rear] = element;
        size++;
    }

    public int dequeue() throws QueueUnderflowException {
        if(isEmpty())
            throw new QueueUnderflowException("Queue is empty");

        int element = queueArray[front];
        front++;
        size--;

        if(isEmpty()) {
            front = 0;
            rear = -1;
        }

        return element;
    }

    public int peek() throws QueueUnderflowException {
        if(isEmpty())
            throw new QueueUnderflowException("Queue is empty");

        return queueArray[front];
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }
}
