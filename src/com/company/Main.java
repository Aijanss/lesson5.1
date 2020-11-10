package com.company;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        CountDownLatch countDownLatch1 = new CountDownLatch(10);
        Semaphore semaphore = new Semaphore(3, true);
        new Uploader(countDownLatch);
        new Downloader(" Пользовател " , countDownLatch, countDownLatch1, semaphore);


    }
}



