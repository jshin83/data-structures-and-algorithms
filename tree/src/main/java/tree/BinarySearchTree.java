package tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<E> {
    Node<E> root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(E value) {
        if(root == null) {
            throw new NullPointerException("List is empty");
        } else {
            addNode(value, root);
        }
    }

    private Node<E> addNode(E value, Node<E> root) {

        return root;
    }
}
