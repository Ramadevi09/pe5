package com.stackroute.pe5;

import java.util.*;

public class SetSorting {
    public List<String> sortedSetMethod(Set<String> input) {

        TreeSet<String> treeSet = new TreeSet<>(input);

        ArrayList<String> sortedList = new ArrayList<>(treeSet);

        return sortedList;

    }
    }


