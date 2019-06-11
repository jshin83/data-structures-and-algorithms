package stacksandqueues;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        size = 0;
    }

    /**
     * Takes int as an argument
     * and adds a new node with that value
     * to the top of the stack with an O(1) Time performance.
     * @param data Object data of node you want to add
     */
    public void push(int data) {
        Node newNode;
        if(top == null) {
            newNode = new Node(data, null);
            top = newNode;
        } else {
            newNode = new Node(data, top);
            top = newNode;
        }
        size++;
    }

    /**
     * Removes the node from the top of the stack,
     * and returns the node’s value.
     * @return int, value of node removed from stack
     */
    public int pop() {
        if(top == null) {
            throw new NullPointerException("List is empty");
        }
        if(size == 1) {
            int result = top.getData();
            top = null;
            size--;
            return result;
        }
        Node newHead = top.getNext();
        top.setNext(null);
        int data = top.getData();
        top = newHead;
        size--;
        return data;
    }

    /**
     * Returns the value of the node located on top of the stack,
     * without removing it from the stack.
     * @return int, value of first Node
     */

    int peek() {
        if(top == null) {
            throw new NullPointerException("List is empty");
        }
        return top.getData();
    }

    public int getSize() {
        return size;
    }

    public int getTopData() {
        return top.getData();
    }

    public Node getTop() {
        return top;
    }
}
