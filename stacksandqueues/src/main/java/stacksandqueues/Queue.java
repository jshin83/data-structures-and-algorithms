package stacksandqueues;

public class Queue {
    private Node front;
    private Node back;
    private int size;

    public Queue() {
        size = 0;
    }

    /**
     * Adds a new node with that value
     * to the back of the queue
     * with an O(1) Time performance.
     * @param data int, value of new node to add
     */
    public void enqueue(int data) {
        Node newNode = new Node(data, null);

        if(front == null) {
            front = back = newNode;
        } else {
            back.setNext(newNode);
            back = newNode;
        }
        size++;
    }

    /**
     * Removes the node from the front of the queue,
     * and returns the node’s value.
     * @return int, value of removed Node
     */
    public int dequeue() {
        int result;
        if(front == null) {
            throw new NullPointerException("List is empty");
        }
        if(size == 1) {
            //save data before pointers changed
            result = front.getData();
            front = back = null;
            size--;
            return result;
        }
        //else, there is more than one element
        //return front data, point front to second element
        result = getFrontData();
        front = front.getNext();
        size--;
        return result;
    }

    public int peek() {
        if(front == null) {
            throw new NullPointerException("List is empty");
        }
        return getFrontData();
    }

    public int getFrontData() {
        return front.getData();
    }

    public int getSize() {
        return size;
    }

    public int getBackData() {
        return back.getData();
    }
}
