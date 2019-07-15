/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph<E> {
    private Map<Node, Set<Node>> vertices;

    /**
     * Constructor
     */
    public Graph() {
        vertices =  new HashMap<>();
    }

    /**
     * Add new node
     * will return null if input value is null or empty
     * @param value E data of new Node
     * @return Node inserted
     */
    public Node addNode(E value) {
        Node newNode;
        if(value != null) {
            newNode = new Node(value);
            vertices.putIfAbsent(newNode, new HashSet<>());
            return newNode;
        }
        return null;
    }

    /**
     * Adds Edge to to and from Nodes if they exist
     * @param to Node, destination Node
     * @param from Node, source Node
     * @param weight int, Edge weight
     */
    public void addEdge(Node to, Node from, int weight) {

        if(vertices.containsKey(to) && vertices.containsKey(from)) {
            Edge edge = new Edge(to, from, weight);

            // add to Set / adjacency list
            // update Node Set of edges
            // update the Vertex with updated Node
            vertices.get(to).add(from);
            to.edges.add(edge);
            vertices.put(to, vertices.get(to));

            vertices.get(from).add(to);
            from.edges.add(edge);
            vertices.put(from, vertices.get(from));
        }
    }

    /**
     * Gets all vertices
     * @return Set of Nodes
     */
    public Set<Node> getNodes() {
        if(vertices != null) {
            return vertices.keySet();
        }
        return null;
    }

    /**
     * Gets all neighbors
     * for a Node
     * @param vertex Node
     * @return Set of Nodes
     */
    public Set<Node> getNeighbors(Node vertex) {
        if(vertices.containsKey(vertex)) {
            return vertices.get(vertex);
        }
        return null;
    }

    /**
     * Getter for size
     * @return int, number of vertices
     */
    public int size() {
        return this.vertices.size();
    }

    /**
     * Inner Node class
     */
    class Node {
        E data;
        Set<Edge> edges;

        Node(E value) {
            this.data = value;
            edges = new HashSet<>();
        }
    }

    /**
     * Inner Edge class
     */
    class Edge {
        int weight;
        Node to;
        Node from;

        /**
         * Constructor
         * @param to Node, destination Node
         * @param from Node, source Node
         * @param weight int, weight
         */
        public Edge(Node to, Node from, int weight) {
            this.to = to;
            this.from = from;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Edge: " +
                    "weight = " + weight;
        }
    }
}
