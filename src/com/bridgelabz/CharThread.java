package com.bridgelabz;

public class CharThread implements Runnable {

    @Override
    public void run() {
        for(char i = 'a'; i <= 'z'; i++) {
            System.out.println(i);
        }

    }

}
