public class ArrayQueue implements Queue {
    private static final int CAPACITY = 100;
    private int capacity;
    private int size = 0;
    private int first = 0;
    private int last = 0;
    private Object Q[];
    
    public ArrayQueue(){
        this(CAPACITY);
    }
    
    public ArrayQueue(int capacity){
        this.capacity = capacity;
        Q = new Object[capacity];
    }
    
    public int size(){
        return (size);
    }
    
    public boolean isEmpty(){
        return (size == 0);
    }
    
    public boolean isFull(){
        return (size == capacity);
    }
    
    public Object front(){
        if (isEmpty())
            throw new QueueEmptyException("Queue is empty");
        return(Q[first]);
    }
    
    public void enqueue(Object item) throws QueueFullException{
        if (isFull())
            throw new QueueFullException("Queue overflow");
        Q[last] = item;
        last = (last+1) % Q.length;
        size++;
    }
    
    public Object dequeue() throws QueueEmptyException{
        if (isEmpty())
            throw new QueueEmptyException("Queue underflow");
        Object item = Q[first];
        Q[first] = null;
        first = (first+1) % Q.length;
        size--;
        return item;
    }
}
