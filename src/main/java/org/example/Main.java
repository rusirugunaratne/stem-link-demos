package org.example;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    private static void countdown(int n) {
        // base case
        if (n < 0) {
            return;
        }

        System.out.println(n);

        countdown(n - 1); // recursive case -> progressing towards base case
    }
    // O(n)

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Mango");
        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

    }
}

















// ArrayList
// adding
//ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Mango");
//        System.out.println("Fruits list: " + fruits);
//        System.out.println("Fruits size: " + fruits.size());
//
//// accessing elements
//String firstFruit = fruits.get(0);
//        System.out.println("First fruit: " + firstFruit);
//
//// update
//        fruits.set(1, "Strawberry");
//        System.out.println("Updated fruits list: " + fruits);
//
//        fruits.add(0, "Abc");
//        System.out.println("Updated fruits list: " + fruits);
//
//        fruits.removeLast();
//        fruits.removeFirst();
//        fruits.remove(1);