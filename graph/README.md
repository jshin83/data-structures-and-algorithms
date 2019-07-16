# Graph
Implemented adjacency list simulated in HashMap of Nodes (Vertices) as keys, and Set of Neighbors as values.

## Approach and Efficiency
+ Used HashMap and Sets for O(1) lookup and add time
+ Update is also O(1) time - constant number of steps, impervious to data size
+ Space O(1) for lookups and adding is constant

## API

`AddNode()`
Adds a new node to the graph
+ Takes in the value of that node
+ Returns the added node

`AddEdge()`
+ Adds a new edge between two nodes in the graph
+ Include the ability to have a “weight”
+ Takes in the two nodes to be connected by the edge
    + Both nodes should already be in the Graph

`GetNodes()`
+ Returns all of the nodes in the graph as a collection (set, list, or similar)

`GetNeighbors()``
+ Returns a collection of nodes connected to the given node
+ Takes in a given node
+ Include the weight of the connection in the returned collection

`Size()``
+ Returns the total number of nodes in the graph`

`bfs(Node node)`
+ Returns Set of breadth first traversal with origin at input Node