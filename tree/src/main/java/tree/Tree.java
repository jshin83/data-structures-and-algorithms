package tree;

import java.util.ArrayList;
import java.util.LinkedList;
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
     * Finds max value
     * in a tree that holds Integers.
     */
    public static int findMaxValue(Tree<Integer> tree) {
        if (tree.root == null) {
            System.out.println("Your input tree is empty");
            return 0;
        }
        int max = tree.root.data;
        return findMax(max, tree.root);
    }

    private static int findMax(int max, Node<Integer> node) {
        if(node == null) {
            return max;
        } else {
            if(node.data > max) max = node.data;
            max = findMax(max, node.left);
            max = findMax(max, node.right);
        }
        return max;
    }

    public static int breadthFirstFindMax(Tree<Integer> tree) {
        if(tree.root == null) {
            System.out.println("List is empty");
            return 0;
        }
        int max = tree.root.data;
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(tree.root);
        while(!queue.isEmpty()) {
            Node<Integer> node = queue.removeFirst();
            if(node.data > max) max = node.data;
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return max;
    }

    /**
     * Breadth first traversal of tree
     * utilizing Linked List.
     * Saves to a List.
     * @return List of Strings containing data in BFS traversal
     */
    public List<String> breadthFirst() {
        if(root == null) {
            System.out.println("List is empty");
            return null;
        }
        List<String> result = new ArrayList<>();
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node node = queue.removeFirst();
            result.add(node.data.toString());
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
        return result;
    }

    /**
     * Breadth first traversal of tree
     * utilizing Linked List.
     * Prints node data while traversing the tree.
     */
    public void printBreadthFirst() {
        if(root == null) {
            System.out.println("List is empty");
            return;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node node = queue.removeFirst();
            System.out.println(node.data);
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
    }

    /**
     * Returns list of preorder tree.
     * Prints error if tree is empty.
     * @return ArrayList of values in Pre Order sequence.
     */
    public List<E> preOrder() {
        if(root == null) {
            System.out.println("Tree is empty");
            return null;
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
     * Prints error if tree is empty.
     * @return ArrayList of values in In Order sequence.
     */
    public List<E> inOrder() {
        if(root == null) {
            System.out.println("Tree is empty");
            return null;
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
     * Prints error if tree is empty.
     * @return ArrayList of values in Post Order sequence.
     */
    public List<E> postOrder() {
        if(root == null) {
            System.out.println("Tree is empty");
            return null;
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
        addPostOrder(node.left);

        //traverse right
        addPostOrder(node.right);

        //root
        traversalList.add(node.data);
    }

    public Node<E> getRoot() {
        return root;
    }

    public void setRoot(Node<E> root) {
        this.root = root;
    }
}
