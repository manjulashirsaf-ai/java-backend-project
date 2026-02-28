package com.example;

//Approach 1: Using Thread class
//Use Thread class → easy but single inheritance
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}
