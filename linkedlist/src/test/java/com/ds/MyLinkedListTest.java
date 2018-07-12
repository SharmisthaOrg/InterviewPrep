package com.ds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyLinkedListTest {
    @Test
    public void testAdd(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("hello");
        myLinkedList.add("sharmistha");
        myLinkedList.add("welcome");
        myLinkedList.add("to");
        myLinkedList.add("india");
        assertEquals("[hello, sharmistha, welcome, to, india]",myLinkedList.toString());
    }
    @Test
    public void testRemove(){
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("hello");
        myLinkedList.add("sharmistha");
        myLinkedList.add("welcome");
        myLinkedList.add("to");
        myLinkedList.add("india");
        myLinkedList.delete("sharmistha");
        assertEquals("[hello, welcome, to, india]",myLinkedList.toString());
    }
}
