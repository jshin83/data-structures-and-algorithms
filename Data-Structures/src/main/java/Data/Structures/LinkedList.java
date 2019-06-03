/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Data.Structures;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    Node head;
    private static int size;

    public LinkedList() {
        size = 0;
    }

    private static class Node {
        private Object data;
        private Node next;

        private Node(Object data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * Takes any value as an argument
     * and adds a new node with that value
     * to the head of the list with an O(1) Time performance
     * @param data int value to insert in new node
     */
     void insert(int data) {
        Node newNode;

        if(head == null) {
            newNode = new Node(data, null);
            head = newNode;
        } else {
            newNode = new Node(data, head);
            head = newNode;
        }
        size++;
    }

    /**
     * Takes any value as an argument
     * and returns a boolean result depending
     * on whether that value exists
     * as a Node’s value somewhere within the list.
     * @param searchValue int to search for
     * @return boolean true if value is found, else false
     */
     boolean includes(int searchValue) {
        Node current = head;
        while(current != null) {
            if(current.data.equals(searchValue)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    /**
     * Takes in no arguments
     * and returns a collection
     * of the current Node values in the Linked List.
     * @return list of all values in linked list
     */
     List<Object> print() {
        List<Object> nodeList = new ArrayList<>();

        Node current = head;

        while (head != null) {
            nodeList.add(current.data);
        }

        return nodeList;
    }

     Object getHeadData() {
        return this.head.data;
    }

     int getSize() {
        return size;
    }

}
