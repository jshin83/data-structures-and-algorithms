/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.Test;
import static org.junit.Assert.*;
import graph.Graph.*;

import java.util.HashSet;
import java.util.List;

public class GraphTest {
    private Graph<Integer> testGraph;

    @Test
    public void init() {
        testGraph = new Graph<>();

    }

    @Test
    public void emptyGraph() {
        assertNull("Declared but not instantiated graph should be null", testGraph);

        init();

        assertEquals("instantiated graph should have size of 0", 0, testGraph.size());
    }

    @Test
    public void addNodeNoNeighbors() {
        init();

        Node three = testGraph.addNode(3);
        testGraph.addNode(3);
        testGraph.getNodes().forEach( vertex -> {
            System.out.println(vertex.data);
            System.out.println(testGraph.getNeighbors(vertex));
        });

        assertEquals("size should be 2", 2, testGraph.size());

        assertEquals("Get neighbors should return []", new HashSet(), testGraph.getNeighbors(three));
    }

    @Test
    public void addNeighborsAndEdge() {
        init();

        Node node1 = testGraph.addNode(3);
        Node node2 = testGraph.addNode(3);

        testGraph.addEdge(node1, node2, 90);
        System.out.println(node1.edges);

        assertTrue(
                "Node1 should have node2 as the only neighbor",
                testGraph.getNeighbors(node1).contains(node2)
                );

        assertEquals(
                "Node1 neighbors list should have size of 1",
                1,
                testGraph.getNeighbors(node1).size()
        );

        assertTrue(
                "Node2 should have node1 as a neighbor",
                testGraph.getNeighbors(node2).contains(node1)
        );

        assertEquals(
                "Node2 neighbors list should have size of 1",
                1,
                testGraph.getNeighbors(node2).size()
        );

        assertEquals(
                "Node 1 edge should contain one edge with weight of 90",
                "[Edge: weight = 90]",
                node1.edges.toString()
        );

        assertEquals(
                "Node 2 edge should contain one edge with weight of 90",
                "[Edge: weight = 90]",
                node2.edges.toString()
        );
    }

    @Test
    public void bfs() {
        init();

        Node node1 = testGraph.addNode(3);
        Node node2 = testGraph.addNode(13);
        Node node3 = testGraph.addNode(7);
        Node node4 = testGraph.addNode(5);
        Node node5 = testGraph.addNode(15);


        testGraph.addEdge(node1, node2, 90);
        testGraph.addEdge(node4, node3, 11);
        testGraph.addEdge(node2, node3, 30);
        testGraph.addEdge(node4, node5, 111);
        testGraph.addEdge(node3, node5, 99);
        testGraph.addEdge(node1, node4, 16);

        List<Node> bfs = testGraph.bfs(node2);

        assertTrue(
                "Node2 should have node1 as a neighbor",
                testGraph.getNeighbors(node2).contains(node1)
        );

        assertTrue(
                "Node2 should have node1 as a neighbor",
                testGraph.getNeighbors(node2).contains(node3)
        );

        assertEquals(
                "Size of result should be same as number of nodes",
                5,
                bfs.size()
        );

        String resultShouldBe = "[Node: data =13, edges =[Edge: weight = 90, Edge: weight = 30]}, " +
                "Node: data =7, edges =[Edge: weight = 99, Edge: weight = 30, Edge: weight = 11]}, " +
                "Node: data =3, edges =[Edge: weight = 16, Edge: weight = 90]}, " +
                "Node: data =15, edges =[Edge: weight = 111, Edge: weight = 99]}, " +
                "Node: data =5, edges =[Edge: weight = 16, Edge: weight = 111, Edge: weight = 11]}]";

        assertEquals(
                "Node2 traversal should match string.",
                resultShouldBe,
                bfs.toString().trim()
        );
    }
}
