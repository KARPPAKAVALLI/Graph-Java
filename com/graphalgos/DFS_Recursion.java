package com.graphalgos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Note: Recursion internally uses a stack

public class DFS_Recursion {
    public static void dfsRecursive(Map<String,List<String>> graph,String source){

        //Here, no explicit base condition is needed.
        //Since, when the source node has no neighbours, then, no iteration will happen.
        //Hence, no function call.

        System.out.println(source);
        for(String n:graph.get(source)) {
            dfsRecursive(graph, n);
        }
    }
    public static void main(String[] args) {
        Map<String,List<String >> graph=new HashMap<>();
        graph.put("a", List.of("b","c"));
        graph.put("b", List.of("d"));
        graph.put("c", List.of("e"));
        graph.put("d", List.of("f"));
        graph.put("e", List.of());
        graph.put("f", List.of());
        dfsRecursive(graph,"a");
    }
}
