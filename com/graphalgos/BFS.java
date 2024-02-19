package com.graphalgos;

import java.util.*;

//Similar, to DFS Code but instead of Stack use Queue
public class BFS {
    public static void breadthFirstSearch(Map<String, List<String>> graph , String start){
        Queue<String> q=new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()){
            String curr = q.remove();
            System.out.println(curr);

            List<String> neighbours = graph.get(curr); //graph.get(curr) -> is actually a list
            q.addAll(neighbours);

            //Alternatively, you can also use loop to add neighbouring nodes
//            for (String n : neighbours) {
//                q.add(n);
//            }
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

        breadthFirstSearch(graph,"a");
    }
}
