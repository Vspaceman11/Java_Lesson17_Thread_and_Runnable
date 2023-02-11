package com.java.study.task3;
public class TextWriter {
    long id = 1;
    synchronized public void write(String text){
        long threadId = Thread.currentThread().getId();
        for (; threadId == id; ) {
            try {
                wait();
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println(text);
        id = threadId;
        notifyAll();
    }
}
