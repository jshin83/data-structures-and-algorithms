package graph;

import java.util.HashSet;
import java.util.Set;

class Node<E> {
    E data;
    Set<Edge> edges;

    Node(E value) {
        this.data = value;
        edges = new HashSet<>();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}