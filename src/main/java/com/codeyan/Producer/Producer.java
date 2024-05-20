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
                System.out.println(STR."Consumed: \{item}");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
