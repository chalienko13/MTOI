package com.chalienko.mtoi.graph;

/**
 * Created by Dmitriy Chalienko on 02.03.2017.
 */
public class Vertex implements Comparable<Vertex>{
    private String label;
    private boolean isVisited;

    public Vertex(String label) {
        this.label = label;
        isVisited = false;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

    @Override
    public String toString() {
        return label;
    }

    @Override
    public int compareTo(Vertex o) {
        return label.compareTo(o.getLabel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        return label.equals(vertex.label);

    }

    @Override
    public int hashCode() {
        return label.hashCode();
    }
}
