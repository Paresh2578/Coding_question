//p50)  WAP to count the degree of each vertex in a directed Graph (where graph is created using 
// edges means if user input 1 2 then there is a directed edge from node 1 to node 2 user enter -1 for stop entering the edge) 

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, Integer> outDegree = new HashMap<>();
        Map<Integer, Map<Integer, Boolean>> graph = new HashMap<>();

        System.out.println("Enter edges (format: from to), enter -1 to stop:");

        while (true) {
            int from = scanner.nextInt();
            if (from == -1) break;
            int to = scanner.nextInt();
            if (to == -1) break;

            graph.putIfAbsent(from, new HashMap<>());
            graph.putIfAbsent(to, new HashMap<>());

            graph.get(from).put(to, true);

            outDegree.put(from, outDegree.getOrDefault(from, 0) + 1);
            inDegree.put(to, inDegree.getOrDefault(to, 0) + 1);
        }

        System.out.println("Vertex Degrees:");
        for (Integer vertex : graph.keySet()) {
            int inDeg = inDegree.getOrDefault(vertex, 0);
            int outDeg = outDegree.getOrDefault(vertex, 0);
            System.out.println("Vertex " + vertex + ": In-Degree = " + inDeg + ", Out-Degree = " + outDeg);
        }

        scanner.close();
    }
}