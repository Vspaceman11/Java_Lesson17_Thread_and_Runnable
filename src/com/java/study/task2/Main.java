package com.java.study.task2;

public class Main{
    public static void main(String[] args) {
        Thread runner = new Thread(new PriorityRunner());
        Thread thread = new Thread(new PriorityThread());

        runner.setName("Runner");
        runner.setPriority(Thread.MAX_PRIORITY);

        thread.setName("Thread");
        thread.setPriority(Thread.MIN_PRIORITY);

        runner.start();
        thread.start();

        for (int j = 0; j <= 50; j++) {
            System.out.println("j = " + j + " " + Thread.currentThread().getName());
        }
    }
}
