/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BstTest {

    private BinarySearchTree<String> tree;

    @Before
    public void init() {
        tree = new BinarySearchTree<>();
    }

    private void addToTree() {
        tree.add("hi");
        tree.add("dog");
        tree.add("cat");
        tree.add("horse");
        tree.add("zebra");
    }

    @Test
    public void testEmpty() {
        assertNull("Tree should be empty at initialization", tree.root);
    }

    @Test
    public void inorderBst() {
        addToTree();
        List<String> result = tree.inOrder();
        StringBuilder resultString = new StringBuilder();
        for (String data : result) {
            resultString.append(data);
        }
        assertEquals("Array for in order should return 'dog cat hi horse zebra' without spaces.",
                "dogcathihorsezebra",
                resultString.toString());
    }

    @Test
    public void preorderBst() {
        addToTree();
        List<String> result = tree.preOrder();
        StringBuilder resultString = new StringBuilder();
        for (String data : result) {
            resultString.append(data);
        }
        assertEquals("Array for pre order should return 'hi dog cat horse zebra.",
                "hidogcathorsezebra",
                resultString.toString());
    }

    @Test
    public void postorderBst() {
        addToTree();
        List<String> result = tree.postOrder();
        StringBuilder resultString = new StringBuilder();
        for (String data : result) {
            resultString.append(data);
        }
        assertEquals("Array for post order should return 'cat dog zebra horse hi.",
                "catdogzebrahorsehi",
                resultString.toString());
    }

    @Test
    public void breadthFirst() {
        BinarySearchTree<Integer> intTree = new BinarySearchTree<>();
        intTree.add(5);
        intTree.add(3);
        intTree.add(7);
        intTree.add(9);
        intTree.add(4);
        List<String> result = intTree.breadthFirst();
        StringBuilder resultString = new StringBuilder();
        for(String data : result) {
            resultString.append(data);
            resultString.append("\n");
        }

        assertEquals("Breadth first iteration of integer tree should bring back 5, 3, 7, 4, 9",
                "5\n" +
                        "3\n" +
                        "7\n" +
                        "4\n" +
                        "9\n",
                resultString.toString());

        addToTree();
        List<String> result2 = tree.breadthFirst();
        StringBuilder result2String = new StringBuilder();
        for(String data : result2) {
            result2String.append(data);
            result2String.append("\n");
        }

        assertEquals("Breadth first iteration of String tree should bring back 5, 3, 7, 4, 9",
                "hi\n" +
                        "dog\n" +
                        "horse\n" +
                        "cat\n" +
                        "zebra\n",
                result2String.toString());

        intTree.printBreadthFirst();
        tree.printBreadthFirst();
    }

}
