package org.example.stack;

import org.example.exception.StackOverflowException;
import org.example.exception.StackUnderflowException;

import java.util.Stack;

public class ArrayStack {
    private final int MAX_SIZE = 5;
    private int[] stackArray;
    private int top;

    public ArrayStack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    // O(1)
    public void push(int element) throws StackOverflowException {
        if(isFull()) {
            throw new StackOverflowException("Stack is full");
        }

        stackArray[++top] = element;
    }

    // O(1)
    public int pop() throws StackUnderflowException {
        if(isEmpty())
            throw new StackUnderflowException("Stack is empty");

        return stackArray[top--];
    }

    public int peek() throws StackUnderflowException {
        if(isEmpty())
            throw new StackUnderflowException("Stack is empty");

        return stackArray[top];
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }


}
