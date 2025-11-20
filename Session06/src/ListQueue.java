public class ListQueue implements Queue{
    private int size;
    @Override
    public void enqueue(int data) {
        if(size > 1000)
            throw new RuntimeException("Too long queue");
        size++;
    }

    @Override
    public int dequeue() {
        size--;
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }
}
