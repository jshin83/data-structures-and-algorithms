package tree;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class TreeTest {

    private Tree<String> tree;

    @Before
    public void init() {
        tree = new Tree<>();
    }

    @Test
    public void addToTree() {
        Node<String> lastNode = new Node<>("end", null, new Node<>("very last one", null, null));
        tree.root = new Node<>("hi", new Node<>("yup", null, null), lastNode);
    }

    @Test
    public void testEmpty() {
        assertNull("Tree should be empty at initialization", tree.root);
    }

    @Test
    public void inOrder() {
        addToTree();

        List<String> result = tree.inOrder();
        StringBuilder resultString = new StringBuilder();
        for(String data : result) {
            resultString.append(data);
        }
        assertEquals("Array should be 'yup, hi, end, very last one' without spaces",
                "yuphiendvery last one",
                resultString.toString());
    }

    @Test
    public void PostOrder() {
        addToTree();

        List<String> result = tree.postOrder();
        StringBuilder resultString = new StringBuilder();
        for (String data : result) {
            resultString.append(data);
        }
        assertEquals("Array should be 'yup, hi, end, very last one' without spaces",
                "yupvery last oneendhi",
                resultString.toString());
    }

    @Test
    public void PreOrder() {
        addToTree();

        List<String> result = tree.preOrder();
        StringBuilder resultString = new StringBuilder();
        for (String data : result) {
            resultString.append(data);
        }
        assertEquals("Array should be 'yup, hi, end, very last one' without spaces",
                "hiyupendvery last one",
                resultString.toString());
    }

    @Test
    public void findMaxOnEmpty() {
        Tree<Integer> tree = new Tree<>();

        assertEquals("Tree max on empty tree should return 0", 0, Tree.findMaxValue(tree));
    }

    @Test
    public void findMax() {
        Tree<Integer> tree = new Tree<>();
        Node<Integer> lastNode = new Node<>(9, null, new Node<>(11, null, null));
        tree.root = new Node<>(5, new Node<>(3, null, null), lastNode);

        assertEquals("Tree max should be 11", 11, Tree.findMaxValue(tree));

        lastNode = new Node<>(19, null, new Node<>(11, new Node<>(150, null, null), null));
        tree.root = new Node<>(57, new Node<>(63, null, null), lastNode);

        assertEquals("Tree max should be 150", 150, Tree.findMaxValue(tree));

    }

    @Test
    public void findMaxBFOnEmpty() {
        Tree<Integer> tree = new Tree<>();

        assertEquals("Tree max on empty tree should return 0", 0, Tree.breadthFirstFindMax(tree));
    }

    @Test
    public void findMaxBF() {
        Tree<Integer> tree = new Tree<>();
        Node<Integer> lastNode = new Node<>(9, null, new Node<>(11, null, null));
        tree.root = new Node<>(5, new Node<>(3, null, null), lastNode);

        assertEquals("Tree max should be 11", 11, Tree.breadthFirstFindMax(tree));

        lastNode = new Node<>(19, null, new Node<>(11, new Node<>(150, null, null), null));
        tree.root = new Node<>(57, new Node<>(63, null, null), lastNode);

        assertEquals("Tree max should be 150", 150, Tree.breadthFirstFindMax(tree));

    }
}
