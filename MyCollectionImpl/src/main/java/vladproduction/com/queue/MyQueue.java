package vladproduction.com.queue;

public interface MyQueue {
    public int size();
    public boolean isEmpty();
    public void enQueue(Object o);
    public Object deQueue();
}
