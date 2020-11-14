package com.company;

import java.util.concurrent.CountDownLatch;

public class Uploader extends Thread {
    CountDownLatch countDownLatch;

    public Uploader(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public  void run() {

        System.out.println(" Файл загружается  ");
            try {
                System.out.println(" * ");
                System.out.println(" Файл загружон на сервер ");
                sleep(50 / 20 * 1000);
                System.out.println(" * ");
                sleep(50 / 20 * 1000);
                System.out.println(" * ");
                sleep(50 / 20 * 1000);
                System.out.println(" * ");
                sleep(50 / 20 * 1000);
                System.out.println(" * ");
                sleep(50 / 20 * 1000);
                System.out.println(" * ");
                sleep(50 / 20 * 1000);
               System.out.println(" Файл загружон на сервер ");
               countDownLatch.countDown();
            } catch (InterruptedException interruptedException) {
               
            }
        }
    }

