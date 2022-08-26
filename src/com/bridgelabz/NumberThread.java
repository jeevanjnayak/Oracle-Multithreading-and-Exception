package com.bridgelabz;

public class NumberThread extends Thread {
    Thread charT;
    public NumberThread(Thread charT){
        this.charT = charT;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(charT.isAlive())
                System.out.println(i+1);
        }
    }
}
