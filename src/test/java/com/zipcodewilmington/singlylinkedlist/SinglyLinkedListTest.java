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

    @Test
    public void toStringTest4() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        String expected = "head -> [1] -> [2] -> [3] -> NULL";

        Assert.assertEquals(expected, linkedList.toString());

    }

    @Test
    public void size0Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();


        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void size1Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        linkedList.add(1);

        Assert.assertEquals(1, linkedList.size());
    }

    @Test
    public void size2Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        linkedList.add(1);
        linkedList.add(2);

        Assert.assertEquals(2, linkedList.size());
    }

    @Test
    public void find0Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        Assert.assertEquals(-1, linkedList.find(1));
    }

    @Test
    public void find1Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);

        Assert.assertEquals(0, linkedList.find(1));
    }

    @Test
    public void find1aTest() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);

        Assert.assertEquals(linkedList.size() - 1, linkedList.find(1));
    }

    @Test
    public void find2Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(7);
        linkedList.add(5);

        Assert.assertEquals(0, linkedList.find(7));
        Assert.assertEquals(1, linkedList.find(5));
    }

    @Test
    public void find3Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);

        Assert.assertEquals(0, linkedList.find(5));
        Assert.assertEquals(1, linkedList.find(7));
        Assert.assertEquals(2, linkedList.find(9));
    }

    @Test
    public void contains0Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(7);

        Assert.assertTrue(linkedList.contains(7));

    }

    @Test
    public void contains2Test() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(7);
        linkedList.add(9);

        Assert.assertTrue(linkedList.contains(7));
        Assert.assertTrue(linkedList.contains(9));

    }
}
