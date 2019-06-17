package tree;

public class BinarySearchTree<E extends Comparable<? super E>> {
    Node<E> root;

    /**
     * Constructor.
     * Initializes root to null.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Adds a new node to the tree.
     * Will not add if it is a duplicate value.
     * @param value value of Node to be added, generic
     * @return Node, modified tree
     */
    public Node<E> add(E value) {
        if(root == null) {
            root = new Node<>(value, null, null);
        } else {
            addNode(value, root);
        }
        return root;
    }

    //helper - recursive method for add node
    private Node<E> addNode(E value, Node<E> root) {
        if(root == null) {
            return add(value);
        }
        int compare = value.compareTo(root.data);
        if(compare < 0) {
            root.left = addNode(value, root.left);
        } else if (compare > 0) {
            root.right = addNode(value, root.right);
        }
        return root;
    }

    /**
     * Checks if there is a duplicate in the tree.
     * @param root Node
     * @param value value to search for
     * @return boolean, true if value exists, false if not
     */
    public boolean contains(Node<E> root, E value) {
        return containsNode(root, value);
    }

    //helper - recursive method for contains
    private boolean containsNode(Node<E> root, E value) {
        if (root == null) {
            return false;
        }
        else {
            int compare = value.compareTo(root.data);
            if (compare == 0) return true; //found a duplicate
            else if (compare < 0) return contains(root.left, value);
            else /* compare > 0 */ return contains(root.right, value);}
        }
    }
