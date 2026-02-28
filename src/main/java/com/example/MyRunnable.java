package com.example;

//Approach 2: Using Runnable interface
//Use Runnable interface → preferred, allows inheritance and flexibility
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}