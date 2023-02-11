package com.java.study.task5_resolve_locking;

public class ThreadOne extends Thread{
    private Thread thread1;

    ThreadOne(){
        System.out.println("Create ThreadOne");
    }

    public void setThread1(Thread thread1) {
        this.thread1 = thread1;
    }

    @Override
    public void run() {
        System.out.println("Starting ThreadOne");

        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("ThreadOne Finished");
    }
}
