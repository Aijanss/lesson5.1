package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Downloader extends Thread {
    private CountDownLatch countDownLatch;
    private CountDownLatch countDownLatch1;
    private Semaphore Semaphore;

    public Downloader(String name, CountDownLatch countDownLatch,
                      CountDownLatch countDownLatch1, Semaphore semaphore) {
        super(name);
        this.Semaphore = semaphore;
        this.countDownLatch = countDownLatch;
        this.countDownLatch1 = countDownLatch1;
        this.start();
    }

    @Override
    public synchronized void run() {
        for (int i = 1; i < 11; i++) {
            try {
                sleep(300);
                Semaphore.acquire();
                System.out.println(getName() + i + "  Скачивает файл с сервера");
                sleep(1500);
                System.out.println(getName() + i + " Скачал файл");
                countDownLatch1.countDown();
                Semaphore.release();
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}

