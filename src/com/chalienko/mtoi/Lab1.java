package com.chalienko.mtoi;

import com.chalienko.mtoi.graph.Graph;
import com.chalienko.mtoi.graph.Vertex;
import com.chalienko.mtoi.graph.impl.UndirectedGraph;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Dmitriy Chalienko on 02.03.2017.
 */
public class Lab1 {
    public static void main(String[] args) {
        Graph graph = new UndirectedGraph();
        List<Vertex> vertices = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            Vertex vertex = new Vertex("№" + i);
            vertices.add(vertex);
            graph.addVertex(vertex);
        }
        graph.addEdge(vertices.get(0), vertices.get(1));
        graph.addEdge(vertices.get(1), vertices.get(2));
        graph.addEdge(vertices.get(2), vertices.get(3));
        graph.addEdge(vertices.get(2), vertices.get(4));
        graph.addEdge(vertices.get(2), vertices.get(5));
//        graph.addEdge(vertices.get(3), vertices.get(1));

        System.out.println(graph);

        System.out.println(graph.isAcyclic());

    }
}
