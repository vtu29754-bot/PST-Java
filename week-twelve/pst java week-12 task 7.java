import java.util.*;

class PST_Java_Week12_Task7 {
    public static boolean checkPath(Map<Integer, Set<Integer>> graph, int src, int dest) {
        if (src == dest) return true;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        visited.add(src);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (curr == dest) return true;
            for (int next : graph.getOrDefault(curr, Collections.emptySet())) {
                if (!visited.contains(next)) {
                    visited.add(next);
                    queue.add(next);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int[][] edges = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        for (int[] edge : edges) {
            graph.putIfAbsent(edge[0], new HashSet<>());
            graph.putIfAbsent(edge[1], new HashSet<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        int start = 1, destination = 5;
        System.out.println("Path exists from " + start + " to " + destination + ": " + 
                           (checkPath(graph, start, destination) ? "YES" : "NO"));
    }
}

/*
INPUT & OUTPUT:

INPUT:
Junction Connections: (1,2), (2,3), (3,4), (4,5)
Start: 1, Destination: 5

OUTPUT:
Path exists from 1 to 5: YES
*/
