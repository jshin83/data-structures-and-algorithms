package stacksandqueues;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    Queue queue;

    @Before
    public void init() {
        queue = new Queue();
    }

    @Test (expected = NullPointerException.class)
    public void dequeueEmptyList() {
        queue.dequeue();
    }

    @Test
    public void addToEmptyList() {
        queue.enqueue(0);
        assertEquals("Data should be 0", 0, queue.getFrontData());
        assertEquals("Size should be 1", 1, queue.getSize());
    }

    @Test (expected = NullPointerException.class)
    public void removeOneItemFromListWithOneElement() {
        addToEmptyList();
        assertEquals("Data should return 0", 0, queue.dequeue());
        assertEquals("Should be empty, throw error", NullPointerException.class, queue.dequeue());
    }

    @Test
    public void addAndRemoveMany() {
        addToEmptyList();
        queue.enqueue(1);
        queue.enqueue(2); //0, 1, 2
        assertEquals("Size should be 3", 3, queue.getSize());
        assertEquals("Should return top element, 0", 0, queue.peek());
        assertEquals("Should remove top element 0", 0, queue.dequeue());
        assertEquals("Should be size of 2", 2, queue.getSize());
        assertEquals("Should remove top element, 1", 1, queue.dequeue());
        assertEquals("Should return top element 2", 2, queue.peek());
        assertEquals("Should return 3", 2, queue.dequeue());
        assertEquals("Size should be 0", 0, queue.getSize());
    }
}
