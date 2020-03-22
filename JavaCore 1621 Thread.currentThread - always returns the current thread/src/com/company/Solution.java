package com.company;

/*

1621 Thread.currentThread - always returns the current thread
1. In the printMsg method, assign the current thread to the variable t.
2. In the printMsg method, after all actions, set the delay to 1 millisecond.

Requirements:
1. The printMsg method should retrieve the current thread using Thread.currentThread.
2. The printMsg method should lull the thread 1 millisecond.
3. The printMsg method should call the getName method on the current thread.
4. The main method should call the printMsg method on an object of type NameOfDifferentThreads 5 times.
5. The run method must call the printMsg method 5 times.
6. The printMsg method of an object of type NameOfDifferentThreads must be summarized 10 times.


 */

import java.util.ArrayList;
import java.util.List;

/*
Horse Racing
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        NameOfDifferentThreads tt = new NameOfDifferentThreads();
        tt.start();
        for (int i = 0; i < count; i++) {
            tt.printMsg();
        }
    }

    public static class NameOfDifferentThreads extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }

        public void printMsg() {
            Thread t = Thread.currentThread();//null;//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("name=" + name);
            //add sleep here - добавь sleep тут
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


