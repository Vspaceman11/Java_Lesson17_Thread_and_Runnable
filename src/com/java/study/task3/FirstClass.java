package com.java.study.task3;

public class FirstClass implements Runnable{
    private  TextWriter textWriter;
    private String name = "First Class";

    public FirstClass(TextWriter textWriter) {
        this.textWriter = textWriter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            textWriter.write(name);
        }
    }
}
