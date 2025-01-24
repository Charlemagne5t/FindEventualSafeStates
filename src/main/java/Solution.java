import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int  n = graph.length;
        List<Integer> res = new ArrayList<>();

        int[] vis = new int[n];
        for(int i = 0; i < n; i++) {
            if(graph[i].length == 0) {
                vis[i] = 2;
            }
        }

        for(int i = 0; i < n; i++) {
            if(dfs(i, graph, vis)){
                res.add(i);
            }
        }
        return res;
    }

    boolean dfs(int i, int[][] graph, int[] vis) {
        if(vis[i] == 2) {
            return true;
        }
        if(vis[i] == 1) {
            return false;
        }
        vis[i] = 1;

        for(int j = 0; j < graph[i].length; j++) {
            if(!dfs(graph[i][j], graph, vis)) {
                return false;
            }
        }
        vis[i] = 2;
        return true;
    }
}
