package com.tukku.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayListTest {
    @Test
    public void concurrentModificationException(){
        List<String> l =new ArrayList();
        l.add("q");l.add("q1");l.add("q2");

        System.out.println(l);
        l.add(1, "q*");
        Iterator i =l.iterator();
        while (i.hasNext()){
            i.next();
            //l.remove("q*");
            i.remove();
        }

        System.out.println(l);

        Math.abs(10);
    }
    @Test
    public void add(){

    }
}
