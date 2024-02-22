package com.graphquestions;

import java.util.*;

//All methods are static since, we are not creating & using any objects.

public class HasPath {
    public static boolean dfs(int src,int dest,Map<Integer, List<Integer>> g, boolean visited[]){
        if(src==dest)
            return true;
        visited[src]=true;
        for(int node:g.get(src)){
            if(!visited[node]){
                if(dfs(node,dest,g,visited))
                    return true;
            }

        }
        return false;
    }

    private static Map<Integer, List<Integer>> buildGraph(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i=0; i<n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i=0; i<edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        return graph;
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = buildGraph(n, edges);
        boolean visited[]=new boolean[n];
        return dfs(source,destination,graph,visited);
    }

    public static void main(String[] args) {
        //Hard Code
        int n=6;
        int edges[][] = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        System.out.println(validPath(n,edges,0,5));
    }
}
