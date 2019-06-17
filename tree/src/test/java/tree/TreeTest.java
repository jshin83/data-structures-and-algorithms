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

}
