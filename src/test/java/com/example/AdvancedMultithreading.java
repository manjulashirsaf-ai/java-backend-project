package com.example;

public class AdvancedMultithreading {
    public static void main(String[] args) {

        // Create two Runnable tasks
        Runnable task1 = new NumberPrinter("Thread-1");
        Runnable task2 = new NumberPrinter("Thread-2");

        // Create threads
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start threads
        t1.start();
        t2.start();
    }
}