package com.codeyan;

import com.codeyan.Buffer.Buffer;
import com.codeyan.Consumer.Consumer;
import com.codeyan.Producer.Producer;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;

public class Main {
    private static int NUM_PRODUCERS = 2;
    private static int NUM_CONSUMERS = 3;

    private static Supplier<Integer> generateSupplier(Random random, int interval) {
        Supplier<Integer> sup = () -> random.nextInt(interval);
        return sup;
    }

    public static void main(String[] args) {

        Buffer<Integer> buffer = new Buffer<Integer>(55);

        Random random = new Random();
        var sup = generateSupplier(random, 25);

        ExecutorService executor = Executors.newFixedThreadPool(NUM_PRODUCERS + NUM_CONSUMERS + 1);

        for (int i = 0; i < NUM_PRODUCERS; i++)
            executor.execute(new Producer<Integer>(i, buffer, sup));

        for (int i = 0; i < NUM_PRODUCERS; i++)
            executor.execute(new Consumer(i, buffer));
    }
}