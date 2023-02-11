package com.java.study.task2;

public class PriorityThread implements Runnable{
    @Override
    public void run() {
        for (int k = 0; k <= 50; k++) {
            System.out.println("k = " + k + " " + Thread.currentThread().getName());
        }
    }
}
