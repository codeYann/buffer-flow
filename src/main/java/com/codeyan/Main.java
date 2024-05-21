package com.codeyan;

import com.codeyan.Buffer.Buffer;
import com.codeyan.Consumer.Consumer;
import com.codeyan.Producer.Producer;

import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Buffer<Integer> buffer = new Buffer<Integer>(3);

        Random random = new Random();

        Supplier<Integer> supplier = () -> random.nextInt(25);

        Producer<Integer> producer = new Producer<Integer>(buffer, supplier);
        Consumer consumer = new Consumer(buffer);

        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread.start();
        thread2.start();
    }
}