package com.java.study.task5_resolve_locking;

public class ThreadTwo extends Thread{
    private Thread thread2;
    ThreadTwo(){
        System.out.println("Create ThreadTwo");
    }

    public void setThread2(Thread thread2) {
        this.thread2 = thread2;
    }

    @Override
    public void run() {
        System.out.println("Starting ThreadTwo");

        try {
            sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("ThreadTwo Finished");
    }
}
