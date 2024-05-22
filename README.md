# Producer-Consumer Problem with Thread Pool

This branch contains an implementation of the Producer-Consumer problem using a thread pool. The Producer-Consumer problem is a classic example of a multiprocessing synchronization problem. In this approach, a pool of threads is used to handle the producers and consumers, improving the efficiency and management of thread resources.

## Overview

1. **Producer**: Generates data and places it into a shared buffer.
2. **Consumer**: Takes data from the shared buffer and processes it.
3. **Thread Pool**: Manages a pool of threads to execute producer and consumer tasks efficiently.

A shared buffer (implemented as a thread-safe queue) is used for communication between the producers and consumers.

## Implementation Details

This implementation utilizes a thread pool to manage and reuse threads, which can help improve performance and resource management compared to creating and destroying threads for each producer and consumer task.

The thread pool is generated based on the number of consumers and producers present.


### Key Components

- **ThreadPoolExecutor**: Manages the pool of threads and schedules tasks.
- **Producer**: A task for generating data and placing it into the shared buffer.
- **Consumer**: A task for consuming data from the shared buffer and processing it.
- **Shared Buffer**: A thread-safe queue that facilitates communication between producers and consumers.

### Benefits

- **Improved Resource Management**: By reusing threads, the thread pool approach reduces the overhead associated with thread creation and destruction.
- **Scalability**: The thread pool can be configured to handle a varying number of producer and consumer tasks, allowing the system to scale efficiently.

