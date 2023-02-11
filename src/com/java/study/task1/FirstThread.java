package com.java.study.task1;

public class FirstThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has done");
    }
}
