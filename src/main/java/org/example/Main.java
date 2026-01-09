package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // adding
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits list: " + fruits);
        System.out.println("Fruits size: " + fruits.size());

        // accessing elements
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);

        // update
        fruits.set(1, "Strawberry");
        System.out.println("Updated fruits list: " + fruits);

        fruits.add(0, "Abc");
        System.out.println("Updated fruits list: " + fruits);

        fruits.removeLast();
        fruits.removeFirst();
        fruits.remove(1);
    }
}