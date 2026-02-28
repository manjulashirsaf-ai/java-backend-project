package com.example;

public class MultithreadingRunnableExample {
    public static void main(String[] args) {
        MyRunnable task = new MyRunnable();

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        //start() → Starts a new thread and calls run() internally
        t1.start();
        t2.start();
    }
}