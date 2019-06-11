package pseudoqueue;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PseudoqueueTest {
    private PseudoQueue testerQueue;

    @Before
    public void init() {
        testerQueue = new PseudoQueue();
    }

    @Test (expected = NullPointerException.class)
    public void emptyQueue() {
        assertNull("Queue top should be null", testerQueue.queue.getTop());
        assertNull("Reverser queue top should be null", testerQueue.reverser.getTop());
        //throw error
        testerQueue.dequeue();
    }

    @Test
    public void addOneElement() {
        testerQueue.enqueue(1);
        assertEquals("Calling dequeue on list with one element should return value of 1",
                1,
                testerQueue.dequeue());
    }

    @Test
    public void manyElements() {
        testerQueue.enqueue(2);
        testerQueue.enqueue(3); //3, 2, 1 in queue stack

        //remove each element one by one and get in order 1, 2, 3

        assertEquals("Removing one element should return 1",
                2,
                testerQueue.dequeue());
        assertEquals("Removing one element should return 1",
                3,
                testerQueue.dequeue());
    }

}
