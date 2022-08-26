package com.bridgelabz;

public class ImplementationClass {

    public static void main(String[] args) {

        CharThread charThread = new CharThread();
        Thread charTh = new Thread(charThread);
        charTh.start();

        NumberThread numberThread = new NumberThread(charTh);
        numberThread.start();




    }
}
