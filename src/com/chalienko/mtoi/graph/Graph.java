package com.chalienko.mtoi.graph;

import java.util.*;

/**
 * Created by Dmitriy Chalienko on 02.03.2017.
 */
public abstract class Graph {
    protected Map<Vertex, List<Vertex>> vertexMap = new TreeMap<>();
    private boolean isAcyclic = true;
    protected int edgeCount;
    private int vertexCount;

    public int getEdgeCount() {
        return edgeCount;
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public Map<Vertex, List<Vertex>> getVertexMap() {
        return vertexMap;
    }

    public Set<Vertex> getVertices(){
        return vertexMap.keySet();
    }

    public abstract void addEdge(Vertex leaves, Vertex enters);

    public void addVertex(Vertex vertex) {
        if (!hasVertex(vertex)) {
            vertexMap.put(vertex, new ArrayList<>());
            vertexCount++;
        }
    }
    public boolean hasVertex(Vertex vertex) {
        return vertexMap.containsKey(vertex);
    }

    public boolean hasEdge(Vertex leaves, Vertex enters) {
        if (!hasVertex(leaves)) return false;
        List<Vertex> edges = vertexMap.get(leaves);
        return Collections.binarySearch(edges, enters) != -1;
    }

    private void dfs(Vertex vertex, Vertex p) {
        vertex.setVisited(true);
        for (Vertex u : vertexMap.get(vertex)) {
            if (!u.isVisited()) {
                dfs(u, vertex);
            } else if (!u.equals(p)) {
                isAcyclic = false;
            }
        }
    }

    public boolean isAcyclic() {
        if (vertexCount - edgeCount != 1) {
            return isAcyclic = false;
        }
        vertexMap.keySet().stream().filter(vertex -> !vertex.isVisited()).forEach(vertex -> dfs(vertex, null));
        return isAcyclic;
    }

    @Override
    public String toString() {
        return vertexMap.toString();
    }
}
