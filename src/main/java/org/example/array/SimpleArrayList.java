package org.example.array;

import java.util.ArrayList;

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

public class SimpleArrayList {
    private int[] array;
    private int size;
    private int capacity;

    public SimpleArrayList() {
        this.capacity = 10;
        this.array = new int[this.capacity];
        this.size = 0;
    }

    // O(1)
    public int size() {
        return this.size;
    }

    // O(1)
    public int get(int index) {
        if(index < 0 || index >= size) {
            throw  new IndexOutOfBoundsException("Index: " + index + "Size: " + size + " is out of bounds");
        }
        return array[index];
    }

    // O(1)
    public void set(int index, int value) {
        if(index < 0 || index >= size) {
            throw  new IndexOutOfBoundsException("Index: " + index + "Size: " + size + " is out of bounds");
        }
        array[index] = value;
    }

    // O(n)
    public int indexOf(int value) {
        for (int i = 0; i < size; i++)
            if(array[i] == value)
                return i;

        return -1;
    }

    // O(n)
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    // O(1) + O(n) + O(1) = O(n)
    private void resize() {
        // new array capacity = capacity * 1.5
        capacity = capacity + (capacity / 2);
        int[] newArray = new int[capacity];

        for (int i = 0; i < size; i++)
            newArray[i] = array[i];

        array = newArray;
        System.out.println("Array resized, new capacity: " + capacity);
    }

    // O(n) -> amortized O(1) // add to end
    public void add(int value) {
        if(size == capacity)
            resize();

        array[size] = value;
        size++;
    }

    // O(n)
    public void add(int index, int value) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + "Size: " + size + " is out of bounds");
        }

        if(size == capacity)
            resize();

        // shift all elements from index to right
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
    }

}
