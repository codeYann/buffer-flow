package com.codeyan;

import java.util.List;
import java.lang.Thread;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Thread> threads = IntStream.range(0, 65)
                .mapToObj(i -> new Thread(
                        () -> System.out.println("Thread " + i + " is Running. ID: " + Thread.currentThread().getId())))
                .toList();

        threads.forEach(Thread::start);
        threads.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                thread.currentThread().interrupt();
                System.err.println("Thread " + thread.getId() + " was interrupted.");
            }
        });

    }
}