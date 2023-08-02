package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void constructorTest() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        Assert.assertNotNull(linkedList);

    }

    @Test
    public void isEmptyTest() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();


        Assert.assertTrue(linkedList.isEmpty());
    }

    @Test
    public void addTest1() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);

        Assert.assertFalse(linkedList.isEmpty());
    }

    @Test
    public void addTest2() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(2);

        Assert.assertFalse(linkedList.isEmpty());
    }

    @Test
    public void toStringTest1() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        String expected = "head -> NULL";

        Assert.assertEquals(expected, linkedList.toString());

    }

    @Test
    public void toStringTest2() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);

        String expected = "head -> [1] -> NULL";

        Assert.assertEquals(expected, linkedList.toString());

    }

    @Test
    public void toStringTest3() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);

        String expected = "head -> [1] -> [2] -> NULL";

        Assert.assertEquals(expected, linkedList.toString());

    }
}
