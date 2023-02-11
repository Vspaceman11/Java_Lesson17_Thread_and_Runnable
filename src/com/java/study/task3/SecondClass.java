package com.java.study.task3;

public class SecondClass implements Runnable {
    private TextWriter textWriter;
    private String name = "Second Class";

    public SecondClass(TextWriter textWriter) {
        this.textWriter = textWriter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            textWriter.write(name);
        }
    }
}