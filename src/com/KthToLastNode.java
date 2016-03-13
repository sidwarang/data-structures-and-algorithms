package com;

import java.util.LinkedList;

/**
 * Created by Siddharth on 3/10/2016.
 */
public class KthToLastNode {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Node n1 = new Node(44,null);
        Node n2 = new Node(54,n1);
        Node n3 = new Node(34,n2);
        Node n4 = new Node(24,n3);
        Node n5 = new Node(14,n4);
        Node n6 = new Node(4,n5);
        kthRecursive(n6,3);
        kthIterative(n6,3);
    }

    private static Node kthIterative(Node n, int k) {
        if(k<=0) return null;
        Node n1 = null;
        Node n2 = null;
        for (int i=0; i<k-1; i++) {
            if (n1 == null) return null;
            n1 = n1.next;
        }

        while (n1.next!=null){
            n1 = n1.next;
            n2 = n2.next;
        }
        return n2;
    }

    private static int kthRecursive(Node n, int k) {
        if(n == null) return 0;
        int count = kthRecursive(n.next,k) + 1;
        if(count == k) System.out.println(n.data);
        return count;
    }
}
