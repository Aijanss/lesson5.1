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
                System.out.println(" * * *");
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
            } catch (InterruptedException interruptedException) {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                sleep(5000);
                countDownLatch.await();
                System.out.println("Файл удален с сервера ");
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

