package com;

/**
 * Created by Siddharth on 3/10/2016.
 */
public class Node {
    int data;
    Node next;

    public Node () {
        data = 0;
        next = null;
    }

    public Node (int cargo, Node next) {
        this.data = cargo;
        this.next = next;
    }

    public String toString () {
        return data + "";
    }
}
