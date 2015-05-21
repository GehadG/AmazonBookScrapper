package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class TreeTest {

    private Tree tree;

    @Before
    public void setUp() throws Exception {
        tree = new Tree();
    }

    @Test
    public void shouldInsertANodeRoot() {
        int data = 2;
        Node insertedNode = tree.insert(data);
        assertEquals(tree.getRoot(), insertedNode);
        assertNull(insertedNode.getLeftNode());
        assertNull(insertedNode.getRightNode());
    }

    @Test
    public void shouldInsertALeftNode() {
        //given
        int rootData = 2;
        tree.insert(rootData);

        //when
        int childData = 1;
        Node insertedNode = tree.insert(childData);

        //then
        assertEquals(tree.getRoot().getLeftNode(), insertedNode);
        assertNull(tree.getRoot().getRightNode());
    }

    @Test
    public void shouldInsertARightNode() {
        //given
        int rootData = 2;
        tree.insert(rootData);

        //when
        int childData = 3;
        Node insertedNode = tree.insert(childData);

        //then
        assertEquals(tree.getRoot().getRightNode(), insertedNode);
        assertNull(tree.getRoot().getLeftNode());
    }


    @Test
    public void shouldCreateRootLeftRightNode() {
        //given
        int rootData = 2;
        tree.insert(rootData);

        //when
        int childData2 = 3;
        Node insertedNode1 = tree.insert(childData2);

        int childData1 = 1;
        Node insertedNode2 = tree.insert(childData1);

        //then
        assertEquals(tree.getRoot().getRightNode(), insertedNode1);
        assertEquals(tree.getRoot().getLeftNode(), insertedNode2);
        assertNotNull(tree.getRoot());
    }

    @Test
    public void shouldDeleteLeftNodeGivenData() {
        //given
        int rootData = 2;
        tree.insert(rootData);

        //when
        int childData2 = 3;
        Node insertedNode1 = tree.insert(childData2);

        int childData1 = 1;
        Node insertedNode2 = tree.insert(childData1);

        tree.delete(insertedNode2.getData());

        //then
        assertEquals(tree.getRoot().getRightNode(), insertedNode1);
        assertEquals(tree.getRoot().getLeftNode(), null);
        assertNotNull(tree.getRoot());
    }

    @Test
    public void shouldDeleteRightNodeGivenData() {
        //given
        int rootData = 2;
        tree.insert(rootData);

        //when
        int childData2 = 3;
        Node insertedNode1 = tree.insert(childData2);

        int childData1 = 1;
        Node insertedNode2 = tree.insert(childData1);

        tree.delete(insertedNode1.getData());

        //then
        assertEquals(tree.getRoot().getLeftNode(), insertedNode2);
        assertEquals(tree.getRoot().getRightNode(), null);
        assertNotNull(tree.getRoot());
    }



    @Test
    public void shouldDeleteRootNodeGivenData() {
        //given
        int rootData = 2;
        tree.insert(rootData);

        //when
        int childData2 = 3;
        tree.insert(childData2);

        int childData1 = 1;
        tree.insert(childData1);

        tree.delete(tree.getRoot().getData());

        //then
        assertNull(tree.getRoot());
    }

    @Test
    public void shouldReturnMaxDepthGivenATree(){
        //given
        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);

        assertEquals(tree.depth(), 3);
    }

    @Test
    public void shouldReturnSizeOfNodes(){

        tree.insert(5);
        tree.insert(2);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);

        assertEquals(tree.size(), 5);

    }

}
