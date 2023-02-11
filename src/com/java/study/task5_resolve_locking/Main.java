package com.java.study.task5_resolve_locking;

public class Main {
    public static void main(String[] args) {
        ThreadOne threadOne = new ThreadOne();
        ThreadTwo threadTwo = new ThreadTwo();

        threadOne.setThread1(threadTwo);
        threadTwo.setThread2(threadOne);

        threadOne.start();
        threadTwo.start();
    }
}
