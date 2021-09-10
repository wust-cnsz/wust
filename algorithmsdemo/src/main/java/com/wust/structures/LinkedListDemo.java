package com.wust.structures;

public class LinkedListDemo {
    public static void main(String[] args) {

    }

    public static void reversedList(LinkedList linkedList){
        LinkedList.Node priNode = null;
        LinkedList.Node reversedNode = linkedList.getHead();
        while(reversedNode != null){
            //临时纪录当前节点的下一个节点
            LinkedList.Node curNode = reversedNode.getNextNode();
            //当前节点指向 前一个节点
            reversedNode.nextNode = priNode;
            //纪录当前节点，等下一次循环 下个节点指向当前
            priNode = reversedNode;
            //节点下移一个
            reversedNode = curNode.getNextNode();
        }
        linkedList.getHead().setNextNode(reversedNode);
    }
}

class LinkedList {
    private Node head = new Node(null);
    class Node {
        private Integer value;
        public Node nextNode;

        public Node(Integer value){
            this.value = value;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node node) {
            nextNode = node;
        }

        public boolean isNext() {
            return nextNode == null;
        }
    }

    public void add(Node node) {
        Node temp = head;
        while(temp.isNext()) {
            temp = head.getNextNode();
        }
        temp.setNextNode(node);
    }

    public Node getHead() {
        return head;
    }
}