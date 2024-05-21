package com.codeyan.Consumer;

import com.codeyan.Buffer.Buffer;

public record Consumer(int id, Buffer buffer) implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                var item = buffer.consume();
                System.out.printf("Consumer: %d, Consumed: %s%n", id, item);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
