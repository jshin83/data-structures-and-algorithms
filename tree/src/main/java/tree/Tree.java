package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree<E extends Comparable<? super E>> {
    List<E> traversalList;
    Node<E> root;

    /**
     * Constructor.
     * Initializes tree, root as null.
     */
    public Tree() {
        root = null;
    }

    /**
     * Returns list of preorder tree.
     * Throws error if tree is empty.
     * @return ArrayList of values in Pre Order sequence.
     */
    public List<E> preOrder() {
        if(root == null) {
            throw new NullPointerException("Tree is empty");
        }
        traversalList = new ArrayList<>();
        addPreOrder(root);
        return traversalList;
    }

    private void addPreOrder(Node<E> node) {
        if (node == null) {
            return;
        }
        //root
        traversalList.add(node.data);

        //traverse left
        addPreOrder(node.left);

        //traverse right
        addPreOrder(node.right);
    }

    /**
     * Returns list of inorder sequence.
     * Throws error if tree is empty.
     * @return ArrayList of values in In Order sequence.
     */
    public List<E> inOrder() {
        if(root == null) {
            throw new NullPointerException("Tree is empty");
        }
        traversalList = new ArrayList<>();
        addInOrder(root);
        return traversalList;
    }

    private void addInOrder(Node<E> node) {
        if (node == null) {
            return;
        }

        //traverse left
        addPreOrder(node.left);

        //root
        traversalList.add(node.data);

        //traverse right
        addPreOrder(node.right);
    }

    /**
     * Returns list of post order sequence.
     * Throws error if tree is empty.
     * @return ArrayList of values in Post Order sequence.
     */
    public List<E> postOrder() {
        if(root == null) {
            throw new NullPointerException("Tree is empty");
        }
        traversalList = new ArrayList<>();
        addPostOrder(root);
        return traversalList;
    }

    private void addPostOrder(Node<E> node) {
        if (node == null) {
            return;
        }

        //traverse left
        addPreOrder(node.left);

        //traverse right
        addPreOrder(node.right);

        //root
        traversalList.add(node.data);
    }
}
