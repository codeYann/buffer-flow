# Producer-Consumer Problem

This repository contains a Java implementation of the Producer-Consumer problem using multithreading. The Producer-Consumer problem is a classic example of a multiprocessing synchronization problem. The producer generates data and stores it in a shared buffer, and the consumer takes the data from the buffer for processing. The challenge is to ensure that the producer does not try to add data into a full buffer and the consumer does not try to remove data from an empty buffer.

## Overview

1. **Producer**: Generates data and places it into a shared buffer.
2. **Consumer**: Takes data from the shared buffer and processes it.

A shared buffer (implemented as thread-safe queue) is used for communication between the producers and consumers.

## Requirements

Java Development Kit (JDK) 8 or higher

## Setup

1. Clone the repository;

```
    git clone https://github.com/codeYann/buffer-flow
    cd clone
```

2. Build the project (if using Maven):

```
    mvn clean install
```