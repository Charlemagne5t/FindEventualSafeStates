import java.util.*;

public class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {

        List<Integer> result = new ArrayList<>();
        int[] visited = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            dfs(graph, i, result, visited);
        }
        Collections.sort(result);
        return result;
    }

    private boolean dfs(int[][] graph, int node, List<Integer> result, int[] visited) {
        if (visited[node] == 2) {
            return true;
        }
        if (visited[node] == 1) {
            return false;
        }

        visited[node] = 1;

        for (int i = 0; i < graph[node].length; i++) {
            if (!dfs(graph, graph[node][i], result, visited)) {
                return false;
            }
        }

        visited[node] = 2;
        result.add(node);
        return true;
    }
}
