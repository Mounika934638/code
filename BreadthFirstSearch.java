import java.util.*;  // Import all utility classes (including Queue and LinkedList)

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

    // Breadth-First Search (BFS)
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        // Mark the starting node as visited and enqueue it
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue and print it
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            // Enqueue all the adjacent vertices of the dequeued vertex
            for (int neighbor : adjacencyList.get(vertex)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class BreadthFirstSearch {
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

        // Perform BFS traversal starting from vertex 0
        System.out.println("Breadth-First Search (BFS) starting from vertex 0:");
        graph.bfs(0);
    }
}
