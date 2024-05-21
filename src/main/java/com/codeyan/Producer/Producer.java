package com.codeyan.Producer;

import com.codeyan.Buffer.Buffer;

import java.util.function.Supplier;

public record Producer<T>(int id, Buffer buffer, Supplier<T> supplier) implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                // Create an item for the buffer;
                T item = supplier.get();
                buffer.produce(item);
                System.out.printf("Producer: %d, Produced: %s%n", id, item);
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
