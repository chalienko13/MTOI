package com.chalienko.mtoi.graph.impl;

import com.chalienko.mtoi.graph.Graph;
import com.chalienko.mtoi.graph.Vertex;

import java.util.*;

/**
 * Created by Dmitriy Chalienko on 02.03.2017.
 */
public class DirectedGraph extends Graph {

    public void addEdge(Vertex leaves, Vertex enters) {
        if (!hasVertex(leaves)) addVertex(leaves);
        if (!hasVertex(enters)) addVertex(enters);

        List<Vertex> edges = vertexMap.get(leaves);
        edges.add(enters);
        Collections.sort(edges);
        edgeCount++;
    }
}
