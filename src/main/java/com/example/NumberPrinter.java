package com.example;

class NumberPrinter implements Runnable {
    private String threadName;

    public NumberPrinter(String name) {
        this.threadName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " -> " + i);
            try {
                // Sleep for 500 milliseconds to simulate delay
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

