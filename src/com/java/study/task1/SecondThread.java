package com.java.study.task1;

public class SecondThread implements Runnable{

    @Override
    public void run() {
                System.out.println(Thread.currentThread().getName() + " has done");
    }
}
