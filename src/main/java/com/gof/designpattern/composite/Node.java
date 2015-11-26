package com.gof.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yl3 on 26.11.15.
 */
public class Node {

    private int id;
    private int spaceNum;
    String symbol;
    List<Node> children;

    public Node(int id, int spaceNum, String symbol) {
        this.id = id;
        this.spaceNum = spaceNum;
        this.symbol = symbol;
        children = new ArrayList<Node>();
    }

    public void add(Node node) {
        children.add(node);
    }

    public void delete(Node node) {
        children.remove(node);
    }

    public int getId() {
        return id;
    }

    public List<Node> getChildren() {
        return children;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i< spaceNum; i++){
            stringBuffer.append(" ");
        }
        return stringBuffer.toString() + this.symbol;
    }
}
