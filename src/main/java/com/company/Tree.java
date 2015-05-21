package com.company;

public class Tree {

    private Node rootNode = null;

    public Node insert(int data) {
        final Node newNode = new Node(data);
        if(rootNode == null) {
            rootNode = newNode;
        }
        else
             insertNode(rootNode, newNode);
        return newNode;
    }

    private void insertNode(Node rootNode, Node newNode) {
        if (newNode.getData() < rootNode.getData())
            if (rootNode.getLeftNode() == null) rootNode.setLeftNode(newNode);
            else insertNode(rootNode.getLeftNode(), newNode);
        else
            if(rootNode.getRightNode() == null) rootNode.setRightNode(newNode);
            else insertNode(rootNode.getRightNode(), newNode);
    }

    public Node getRoot() {
        return rootNode;
    }

    public void delete(int data) {
       if(rootNode.getData() != data)
           removeNode(rootNode, data);
       else
        rootNode = null;
    }

    private void removeNode(Node rootNode, int data) {
        if( data < rootNode.getData())
            if(data != rootNode.getLeftNode().getData()) removeNode(rootNode.getLeftNode(), data);
            else rootNode.setLeftNode(null);
        else
            if(data != rootNode.getRightNode().getData()) removeNode(rootNode.getRightNode(), data);
            else rootNode.setRightNode(null);
    }

    public int depth() {
        return maxDepth(rootNode);
    }

    private int maxDepth(Node rootNode) {
        if(rootNode == null) return 0;
        else{
            int leftDepth = maxDepth(rootNode.getLeftNode());
            int rightDepth = maxDepth(rootNode.getRightNode());

            return (Math.max(leftDepth,rightDepth) + 1);
        }
    }

    public int size() {
        return size(rootNode);
    }

    private int size(Node rootNode) {
        if(rootNode == null) return 0;
        else return (size(rootNode.getLeftNode()) + 1 + size(rootNode.getRightNode()));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tree{");
        sb.append("rootNode=").append(rootNode);
        sb.append('}');
        return sb.toString();
    }
}
