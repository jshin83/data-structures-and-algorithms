package tree;

import java.util.ArrayList;
import java.util.List;

public class Tree<E> {
    List<E> traversalList;
    Node<E> root;

    public Tree() {
        root = null;
    }

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
