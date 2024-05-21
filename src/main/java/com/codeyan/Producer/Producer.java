package com.codeyan.Producer;

import com.codeyan.Buffer.Buffer;

import java.util.function.Supplier;

public record Producer<T>(Buffer buffer, Supplier<T> supplier) implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                // Create an item for the buffer;
                T item = supplier.get();
                buffer.produce(item);
                System.out.printf("Produced: %s%n", item);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
