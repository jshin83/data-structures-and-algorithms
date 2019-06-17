package tree;

public class BinarySearchTree<E extends Comparable<? super E>> extends Tree<E> {

    /**
     * Adds a new node to the tree.
     * Will not add if it is a duplicate value.
     * @param value value of Node to be added, generic
     * @return Node, modified tree
     */
    public void add(E value) {
        if (root == null) {
            this.root = new Node(value, null, null);
        } else {
            this.root = add(value, root);
        }
    }

    //helper - recursive method for add node
    private Node<E> add(E value, Node<E> root) {
        if(root == null) {
            return new Node<E>(value, null, null);
        }
        int compare = value.compareTo(root.data);
        if(compare < 0) {
            root.left = add(value, root.left);
        } else if (compare > 0) {
            root.right = add(value, root.right);
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
        if(root == null) {
            System.out.println("List is empty");
            return false;
        }
        return containsNode(root, value);
    }

    //helper - recursive method for contains
    private boolean containsNode(Node<E> root, E value) {
        if (root == null) {
            return false;
        }
        else {
            int compare = value.compareTo(root.data);
            if (compare == 0) return true; //found a duplicate! return true
            else if (compare < 0) return contains(root.left, value);
            else /* compare > 0 */ return contains(root.right, value);
            }
        }
    }
