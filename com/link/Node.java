package com.link;

import java.util.List;

/**
 * @Author: WK
 * @Data: 2019/6/22 22:44
 * @Description: com.link
 */
//一个节点
public class Node {
    //节点内容
    int data;
    //下一个节点
    Node next;
    public Node(int data) {
        this.data = data;
    }

    /**
     * 为节点追加节点
     */
    public void append(Node node) {
//        this.next = node;
        //当前节点
        Node currentNode = this;
        //循环往后找，直到当前节点的下一个节点为Null
        while (true) {
            //当前节点的下一个节点
            Node nextNode = currentNode.next;
            if (nextNode == null) {
                break;
            }
            //新的当前节点
            currentNode = nextNode;
        }
        //把节点添加到当前节点的下一个节点
        currentNode.next = node;
    }
    /**
     * 获取节点信息
     */
    public int getData(){
        return this.data;
    }
    /**
     * 获取下一个节点
     */
    public Node next(){
        return this.next;
    }
    /**
     * 当前节点是否是最后一个节点
     */
    public boolean isLast(){

        return next==null;
    }
    /**
     * 单链表的删除
     * 如果我们找到要删除的节点，此时我们只能获取要删除节点的下一个节点的信息或者下下一个节点的信息
     * 无法获取前一个节点的信息，会造成断链，所以没法完成删除
     *
     * 我们可以找到要删除的节点的前一个节点，然后把此节点的下下一个节点的信息赋给此节点的下一个节点
     * 此时完成删除操作
     *
     * p.next = p.next.next
     *
     */
    public void removeNext(){
//        LoopNode currentNode = this;
//        currentNode.next = currentNode.next.next;
        //取出下下一个节点
        Node newNode = next.next;
        this.next = newNode;
    }
    /**
     * 单链表插入
     * 因为是单链表 所以我们只能在某一个节点的后面插入
     *
     * 为了保证不断链 我们要先找到
     * s：插入节点
     * p：当前节点
     *
     * s.next = p.next
     * p.next = s
     */
    public void insertNode(Node node){
        Node currentNode = this;
        node.next = currentNode.next;
        currentNode.next = node;

    }
    /**
     * 显示所有节点
     *
     */
    public void show(){
        Node currentNode = this;
        while (true){
            System.out.print(currentNode.getData()+" ");
            //取出下一个节点
            currentNode = currentNode.next;
            if (currentNode==null){
                break;
            }
        }
        System.out.println();
    }
}