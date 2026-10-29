import java.util.*;

class PST_Java_Week11_Task10 {
    public static boolean routeExists(int n, Map<Integer, List<Integer>> adj, int src, int dest) {
        if (src == dest) return true;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        visited.add(src);
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            if (curr == dest) return true;
            for (int neighbor : adj.getOrDefault(curr, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[][] roads = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        for (int[] road : roads) {
            adj.putIfAbsent(road[0], new ArrayList<>());
            adj.putIfAbsent(road[1], new ArrayList<>());
            adj.get(road[0]).add(road[1]);
            adj.get(road[1]).add(road[0]);
        }
        int src = 1, dest = 5;
        System.out.println("Roads: [[1, 2], [2, 3], [3, 4], [4, 5]]");
        System.out.println("Route from " + src + " to " + dest + " exists?");
        System.out.println(routeExists(n, adj, src, dest) ? "YES" : "NO");
    }
}

/*
INPUT & OUTPUT:

INPUT:
5 4
1 2
2 3
3 4
4 5
1 5

OUTPUT:
Roads: [[1, 2], [2, 3], [3, 4], [4, 5]]
Route from 1 to 5 exists?
YES
*/
