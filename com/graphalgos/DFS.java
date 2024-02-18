//this is a hard code
package com.graphalgos;

import java.util.*;

public class DFS {
    public static void depthFirstSearch(Map<String, List<String>> graph , String start){
        Stack<String> s=new Stack<>();
        s.push(start);
        while (!s.empty()){
            String curr = s.pop();
            System.out.println(curr);

            List<String> neighbours = graph.get(curr); //graph.get(curr) -> is actually a list

            for (String n : neighbours) {
                s.push(n);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("a", List.of("c", "b"));
        graph.put("b", List.of("d"));
        graph.put("c", List.of("e"));
        graph.put("d", List.of("f"));
        graph.put("e", List.of());
        graph.put("f", List.of());

        depthFirstSearch(graph,"a");
    }
}
