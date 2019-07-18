package graph;

public class Edge<E> {
    int weight;
    E to;
    E from;

    /**
     * Constructor
     * @param to Node, destination Node
     * @param from Node, source Node
     * @param weight int, weight
     */
    public Edge(E to, E from, int weight) {
        this.to = to;
        this.from = from;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Edge: " +
                "weight = " + weight;
    }
}