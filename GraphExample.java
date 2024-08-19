// Graphs
// A graph is a data structure that consists of a finite set of vertices (nodes) 
// and a set of edges that connect pairs of vertices. 
// Graphs can be used to model networks, such as social networks, road maps, and
// communication networks.

// Example: Representing a Graph using Adjacency List

import java.util.LinkedList;

class Graph {
    private int numVertices;
    private LinkedList<Integer>[] adjLists;

    // Constructor
    public Graph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
        adjLists[dest].add(src);  // For undirected graph
    }

    // Print the graph
    void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer v : adjLists[i]) {
                System.out.print(" -> " + v);
            }
            System.out.println();
        }
    }
}

public class GraphExample {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
        // Output:
        // Vertex 0: -> 1 -> 4
        // Vertex 1: -> 0 -> 2 -> 3 -> 4
        // Vertex 2: -> 1 -> 3
        // Vertex 3: -> 1 -> 2 -> 4
        // Vertex 4: -> 0 -> 1 -> 3
    }
}

