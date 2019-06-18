package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FizzbuzzTest {
    private FizzBuzzTree<String> tree;

    public void init() {
        tree = new FizzBuzzTree<>();
    }

    @Test
    public void emptyTree() {
        init();
        assertNull("Empty tree should have null root", tree.getRoot());
    }

    @Test
    public void inordertest() {
        init();
        tree.add("60");
        tree.add("5");
        tree.add("3");
        tree.add("11");
        tree.add("30");
        tree.add("17");
        tree.add("23");

        StringBuilder finalString = new StringBuilder();

        tree.fizzbuzztree(tree);
        for(String word : tree.inOrder()) {
            finalString.append(word);
            finalString.append(" ");
        }

        assertEquals("In-order traversal should state 'buzz fizz 11 17 23 fizzbuzz fizzbuzz'",
                "buzz fizz 11 17 23 fizzbuzz fizzbuzz ",
                finalString.toString());
    }
    @Test
    public void preordertest() {
        init();
        tree.add("10");
        tree.add("5");
        tree.add("7");
        tree.add("11");
        tree.add("30");
        tree.add("17");
        tree.add("23");

        StringBuilder finalString = new StringBuilder();

        tree.fizzbuzztree(tree);
        for(String word : tree.preOrder()) {
            finalString.append(word);
            finalString.append(" ");
        }

        assertEquals("Pre-order traversal should stat '1 buzz fizz 11 17 fizzbuzz' without spaces in between",
                "buzz buzz 11 fizzbuzz 17 23 7 ",
                finalString.toString());
    }

    @Test
    public void test() {
        init();
        tree.add("1");
        tree.add("5");
        tree.add("3");
        tree.add("11");
        tree.add("30");
        tree.add("17");

        StringBuilder finalString = new StringBuilder();

        tree.fizzbuzztree(tree);
        for(String word : tree.postOrder()) {
            finalString.append(word);
            finalString.append(" ");
        }

        assertEquals("Post-order traversal should state '17 11 fizzbuzz fizz buzz 1'",
                "17 11 fizzbuzz fizz buzz 1 ",
                finalString.toString());
    }
}
