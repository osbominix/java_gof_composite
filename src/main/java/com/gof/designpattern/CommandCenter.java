package com.gof.designpattern;

import com.gof.designpattern.composite.Node;

/**
 * Created by yl3 on 26.11.15.
 */
public class CommandCenter {

    public static void main(String[] args) {

        Node parentNode  = new Node(0, 4, "*");

        Node childNode01 = new Node(1, 3, "*");
        Node childNode02 = new Node(2, 1, "*");

        Node childNode03 = new Node(3, 2, "*");
        Node childNode04 = new Node(4, 3, "*");

        Node childNode05 = new Node(5, 1, "*");
        Node childNode06 = new Node(6, 5, "*");

        parentNode.add(childNode01);
        parentNode.add(childNode02);

        parentNode.add(childNode03);
        parentNode.add(childNode04);

        parentNode.add(childNode05);
        parentNode.add(childNode06);

        System.out.println(parentNode);
        for (Node node : parentNode.getChildren()) {
            if (node.getId()%2 == 0) {
                System.out.println(node);
            } else {
                System.out.print(node);
            }
        }

    }
}
