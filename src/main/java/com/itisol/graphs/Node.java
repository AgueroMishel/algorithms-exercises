package com.itisol.graphs;

public interface Node {
    void setValue(String value);
    String getValue();

    void addChild(Node node);
    void removeChild(Node node);
}
