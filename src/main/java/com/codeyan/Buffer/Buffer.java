package com.codeyan.Buffer;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer<T> {
    private final Queue<T> queue;
    private final int capacity;

    public Buffer(int capacity) {
        this.queue = new LinkedList<>();
        this.capacity = capacity;
    }

    public synchronized void produce(T item) {
        while (queue.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        queue.add(item);
        notifyAll();
    }

    public synchronized T consume() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        var item = queue.poll();
        notifyAll();
        return item;
    }
}
