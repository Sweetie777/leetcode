package com.tang.day05;

/**
 * Author: Sweetie77
 * Created: 2019/5/26
 */
public class testThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("2");
            }
        });
        t.start();

        t.join();
        System.out.println("1");
    }
}
