package pseudoqueue;

import stacksandqueues.Stack;

public class PseudoQueue {
    Stack queue;
    Stack reverser;

    /**
     * This class emulates a queue
     * but instantiates two Stacks.
     */
    public PseudoQueue() {
        queue = new Stack();
        reverser = new Stack();
    }

    void enqueue(int value) {
        //if list is empty, stack method will throw error
        //so no null checking required here
        queue.push(value);
    }

    int dequeue() {
        //if empty, throw error
        if(queue.getTop() == null) {
            throw new NullPointerException("List is empty");
        }
        //if size is one, remove and return data of that one element
        if(queue.getSize() == 1) {
            int result = queue.getTopData();
            queue.pop();
            return result;
        }
        //push elements into reverser stack
        popAndAdd(queue, reverser);
        //save first variable, which is at top
        int result = reverser.pop();
        //put things back in order after popping off needed element
        popAndAdd(reverser, queue);

        return result;
    }

    //helper method to traverse one list and add to another
    private void popAndAdd(Stack listToEmpty, Stack listToPopulate) {

        while(listToEmpty.getSize() > 0) {
            listToPopulate.push(listToEmpty.pop());
        }
    }
}
