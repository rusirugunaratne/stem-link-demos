package org.example.array;

public class SimpleArrayDemo {
    public void simulate() {
        // declare and allocate size
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // declare with initial values
        int[] scores = {10, 20, 30, 40, 50};

        // declare and then initialize
        String[] names;
        names = new String[5];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Bob";
        names[3] = "Alice";
        names[4] = "Tom";

        System.out.println(numbers[5]);
    }
}
