/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree_intersection;

import org.junit.Test;
import static org.junit.Assert.*;

public class TreeIntersectionTest {
    TreeIntersection.Node tree1;
    TreeIntersection.Node tree2;

    /*
        public static void main(String[] args) {
        Node node1 = new Node(3, new Node(7), new Node(99));
        Node node2 = new Node(-77, new Node(100, new Node(99), new Node(0)), new Node(55));
        Node node3 = new Node(1000, node1, new Node(55));

        System.out.println(findDuplicates(node3, node2));
        System.out.println(seen);
    }
     */
    @Test (expected = IllegalArgumentException.class)
    public void nullInput() {

    }

    @Test
    public void testSomeLibraryMethod() {
        TreeIntersection classUnderTest = new TreeIntersection();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
