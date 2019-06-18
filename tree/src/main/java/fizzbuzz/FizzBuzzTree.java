package fizzbuzz;

import tree.BinarySearchTree;
import tree.Node;
import tree.Tree;

public class FizzBuzzTree<E extends Comparable<? super E>> extends BinarySearchTree<E>{

    public static void main(String[] args) {
        FizzBuzzTree<String> tree = new FizzBuzzTree<>();
        tree.add("1");
        tree.add("5");
        tree.add("3");
        tree.add("11");
        tree.add("30");
        tree.add("17");

        tree.fizzbuzztree(tree);
        for(String word : tree.inOrder()) {
            System.out.println(word);
        }
    }

    public Tree<E> fizzbuzztree(Tree<E> tree) {
        if(tree.getRoot() == null) {
            System.out.println("Your input tree is empty");
            return null;
        }
        tree.setRoot(fizzbuzztree(tree.getRoot()));
        return tree;
    }

    private Node<E> fizzbuzztree(Node<E> root) {
        if(root == null) {
            return null;
        }
        //root
        root.setData(evaluateIntToStatement(root.getData()));

        //traverse left
        fizzbuzztree(root.getLeft());

        //traverse right
        fizzbuzztree(root.getRight());

        return root;
    }

    //helper
    private E evaluateIntToStatement(E data) {
        int result = Integer.valueOf(data.toString());
        if(result % 3 == 0 && result % 5 == 0) {
            data = (E)"fizzbuzz";
        } else if(result % 3 == 0) {
            data = (E)"fizz";
        } else if(result % 5 == 0) {
            data = (E) "buzz";
        }
        return data;
    }
}
