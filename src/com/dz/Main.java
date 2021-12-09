package com.dz;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Image workImage=new Image();
        int cores = Runtime.getRuntime().availableProcessors();
        ArrayList<Thread> threads = new ArrayList<Thread>();
        for(int i = 0; i < cores; i++) {
            Thread thread = new Thread(workImage);
            thread.setName(String.valueOf(i));
            threads.add(thread);
        }
        for (Thread thread : threads){
            thread.start();
        }
    }
}

