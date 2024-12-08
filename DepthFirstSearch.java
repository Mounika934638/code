import java.util.*;

// Graph class to represent a graph
class Graph {
    private Map<Integer, List<Integer>> adjacencyList;

    // Constructor
    public Graph() {
        adjacencyList = new HashMap<>();
    }

    // Add a vertex to the graph
    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Add an edge between two vertices
    public void addEdge(int start, int end) {
        adjacencyList.putIfAbsent(start, new ArrayList<>());
        adjacencyList.putIfAbsent(end, new ArrayList<>());
        adjacencyList.get(start).add(end);
        adjacencyList.get(end).add(start); // For undirected graph
    }

    // Depth-First Search (DFS) using recursion
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        dfsUtil(start, visited);
    }

    // Utility function for DFS using recursion
    private void dfsUtil(int vertex, Set<Integer> visited) {
        // Mark the current vertex as visited and print it
        visited.add(vertex);
        System.out.print(vertex + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsUtil(neighbor, visited);
            }
        }
    }
}

public class DepthFirstSearch {
    public static void main(String[] args) {
        // Create a graph object
        Graph graph = new Graph();

        // Add vertices
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);

        // Add edges (undirected graph)
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        // Perform DFS traversal starting from vertex 0
        System.out.println("Depth-First Search (DFS) starting from vertex 0:");
        graph.dfs(0);
    }
}
