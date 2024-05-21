package com.codeyan.Consumer;

import com.codeyan.Buffer.Buffer;

public record Consumer(Buffer buffer) implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                var item = buffer.consume();
                System.out.printf("Consumed: %s%n", item);
                Thread.sleep(1800);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
