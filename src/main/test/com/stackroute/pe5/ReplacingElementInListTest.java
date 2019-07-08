package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReplacingElementInListTest {
    ReplacingElementInList replacingElementInList;
    @Before
    public  void setUp()
    {
        replacingElementInList=new ReplacingElementInList();

    }
    @After
    public void tearDown(){
        System.out.println("After");
        replacingElementInList=null;
    }
    @Test
    public void givenListcontainElementsBasedOnIndexUpdateElements(){
        ArrayList<String> actual=new ArrayList();
        actual.add("Apple");
        actual.add("Grape");
        actual.add("Melon");
        actual.add("Berry");
        ArrayList<String> expected=new ArrayList();
        expected.add("kiwi");
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");
        ArrayList<String> result=replacingElementInList.updateElements(0,"kiwi",actual);
        assertEquals(expected,result);
    }
    @Test
    public void givenListcontainEmptyListBasedOnIndexUpdateElements(){
        ArrayList<String> actual=new ArrayList();

        ArrayList<String> result=replacingElementInList.updateElements(0,"kiwi",actual);
        assertEquals(null,result);
    }



}