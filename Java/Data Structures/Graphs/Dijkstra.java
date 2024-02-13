import java.util.*;

/*
 * @author Jonas Ermert
 */

public class Dijkstra {

    private static final int INFINITY = Integer.MAX_VALUE;

    public static void dijkstra(int[][] graph, int start) {
        int numVertices = graph.length;
        int[] dist = new int[numVertices];
        boolean[] visited = new boolean[numVertices];

        Arrays.fill(dist, INFINITY);
        dist[start] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != INFINITY &&
                        dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist);
    }

    private static int minDistance(int[] dist, boolean[] visited) {
        int min = INFINITY, minIndex = -1;

        for (int v = 0; v < dist.length; v++) {
            if (!visited[v] && dist[v] <= min) {
                min = dist[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

    private static void printSolution(int[] dist) {
        System.out.println("Vertex \t Distance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 2, 0, 4, 0},
                {0, 0, 3, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 5},
                {0, 0, 0, 0, 0}
        };

        dijkstra(graph, 0);
    }
}
