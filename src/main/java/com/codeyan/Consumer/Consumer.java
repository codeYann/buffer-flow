package com.codeyan.Consumer;

import com.codeyan.Buffer.Buffer;

public record Consumer(Buffer buffer) implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                var item = buffer.consume();
                System.out.println(STR."Consumed: \{item}");
                Thread.sleep(400);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
