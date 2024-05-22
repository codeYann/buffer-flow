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

```zsh
    git clone https://github.com/codeYann/buffer-flow
    cd clone
```

2. Build the project (if using Maven):

```zsh
    mvn clean install
```

## Branches

This project explores other approaches and improvements in different branches. You can switch to these branches to see alternative implementations and features.

* **branch-name-1**: Description of the approach or feature explored in this branch.
* **branch-name-2**: Description of the approach or feature explored in this branch.
* **branch-name-3**: Description of the approach or feature explored in this branch.

To switch to a branch, use the following command:

```zsh
    git switch <branch-name>
```

Feel free to explore these branches to understand different methods and improvements for solving the Producer-Consumer problem.

Make sure to replace branch-name-1, branch-name-2, branch-name-3, and their descriptions with the actual names and descriptions of the branches you have in your repository.
