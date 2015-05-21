package com.company;

public class Node {

    private int data;
    private Node leftNode;
    private Node rightNode;

    public Node(int data){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Node{");
        sb.append("data=").append(data);
        sb.append(", leftNode=").append(leftNode);
        sb.append(", rightNode=").append(rightNode);
        sb.append('}');
        return sb.toString();
    }
}
