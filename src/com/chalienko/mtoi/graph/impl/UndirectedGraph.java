package com.chalienko.mtoi.graph.impl;

import com.chalienko.mtoi.graph.Graph;
import com.chalienko.mtoi.graph.Vertex;

import java.util.*;
/**
 * Created by Dmitriy Chalienko on 02.03.2017.
 */
public class UndirectedGraph extends Graph {

    public void addEdge(Vertex leaves, Vertex enters) {
        if (!hasVertex(leaves)) addVertex(leaves);
        if (!hasVertex(enters)) addVertex(enters);

        List<Vertex> edgesLeaves = vertexMap.get(leaves);
        List<Vertex> edgesEnters = vertexMap.get(enters);
        edgesLeaves.add(enters);
        edgesEnters.add(leaves);
        Collections.sort(edgesLeaves);
        Collections.sort(edgesEnters);
        edgeCount++;
    }

}