package com.itisol.graphs;

public interface Graph {
    void add(Node node);
    void remove(Node node);

    void link(Node a, Node b);
    void separate(Node a, Node b);

    int size();
}
