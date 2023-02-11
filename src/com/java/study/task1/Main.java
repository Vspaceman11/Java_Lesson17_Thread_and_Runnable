package com.java.study.task1;

public class Main{
    public static void main(String[] args) throws InterruptedException {
        Thread first = new Thread(new FirstThread());
        Thread second = new Thread(new SecondThread());
        first.setName("First");
        second.setName("Second");

        first.start();
        second.start();

        System.out.println(Thread.currentThread().getName() + " has done");

    }
}
