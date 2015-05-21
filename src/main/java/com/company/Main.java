package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Tree tree = new Tree();
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        System.out.println(tree.toString());
    }
}
