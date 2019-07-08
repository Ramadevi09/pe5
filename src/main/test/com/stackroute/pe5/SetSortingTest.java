package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SetSortingTest {
    SetSorting obj;

    @Before
    public void setUp() throws Exception {
        obj=new SetSorting();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenInputSetReturnSortedSet() {
        Set<String> inSet=new HashSet<>();
        inSet.add("Harry");
        inSet.add("Olive");
        inSet.add("Alice");
        inSet.add("Bluto");
        inSet.add("Eugene");
        List<String> outSet=new ArrayList<>();
        outSet.add("Alice");
        outSet.add("Bluto");
        outSet.add("Eugene");
        outSet.add("Harry");
        outSet.add("Olive");
        assertEquals(outSet,obj.sortedSetMethod(inSet));
    }

}