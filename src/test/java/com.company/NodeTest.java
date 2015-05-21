package com.company;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNull;

public class NodeTest {

    private static final int DATA = 2;
    private Node newNode;

    @Before
    public void setUp() throws Exception {
        newNode = new Node(DATA);
    }

    @Test
    public void shouldCreateNewNodeGivenValue() {

        assertNotNull(new Node(DATA));
    }

    @Test
    public void shouldCreateNewWithNullLeftChildNodeGivenValue() {

        assertNotNull(newNode);
        assertNull(newNode.getLeftNode());
    }


    @Test
    public void shouldCreateNewWithNullRightChildNodeGivenValue() {

        assertNotNull(newNode);
        assertNull(newNode.getRightNode());
    }

}
