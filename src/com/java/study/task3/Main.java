package com.java.study.task3;

public class Main {
    public static void main(String[] args) {
        TextWriter textWriter = new TextWriter();

        FirstClass firstClass = new FirstClass(textWriter);
        SecondClass secondClass = new SecondClass(textWriter);

        Thread firstThread = new Thread(firstClass);
        Thread secondThread = new Thread(secondClass);

        firstThread.start();
        secondThread.start();

    }
}
