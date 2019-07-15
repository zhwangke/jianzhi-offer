package com.link;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @Author: WK
 * @Data: 2019/6/22 22:45
 * @Description: com.link
 */
public class TestNode {
    public static void main(String[] args) {
        //创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        //追加节点
        n1.append(n2);
        n1.append(n3);
        //取出下一个节点
//        System.out.println(n2.next().getData());
//        System.out.println(n1.next().getData());
//        System.out.println(n2.next().isLast());
        n1.show();
        n1.insertNode(new Node(4));
        n1.insertNode(new Node(5));
        n3.insertNode(new Node(6));
        n1.show();
    }
}
