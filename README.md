# ArrayQueue

A simple implementation of a circular array-based queue in Java.

## Features

- Enqueue items
- Dequeue items
- Check if the queue is full or empty
- Access the front item without removing it

## Usage

### Creating a Queue

```java
ArrayQueue queue = new ArrayQueue(); // Default capacity of 100
ArrayQueue customQueue = new ArrayQueue(50); // Custom capacity
```

### Basic Operations

```java
queue.enqueue(item); // Add an item to the queue
Object frontItem = queue.front(); // Get the front item
Object dequeuedItem = queue.dequeue(); // Remove and return the front item
int size = queue.size(); // Get the current size of the queue
boolean isEmpty = queue.isEmpty(); // Check if the queue is empty
boolean isFull = queue.isFull(); // Check if the queue is full
```

## Exceptions

- `QueueEmptyException` - Thrown when trying to dequeue from an empty queue.
- `QueueFullException` - Thrown when trying to enqueue into a full queue.
