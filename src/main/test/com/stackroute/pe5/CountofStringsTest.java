package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountofStringsTest {
    CountofStrings countofStrings;
    @Before
    public  void setUp()
    {
countofStrings=new CountofStrings();
    }
    @After
    public void tearDown(){
countofStrings=null;
    }
    @Test
    public void givenStringShouldReturnCountOfWords(){
        Map<String,Integer> excepted=new HashMap<>();
        excepted.put("one",5);
        excepted.put("two",2);
        excepted.put("three",2);
        Map result=countofStrings.stringcount("one one -one___two,,three,one @three*one?two","one","two","three");
    assertEquals(excepted,result);
    }
    @Test
    public void givenStringShouldReturnNull(){
        Map result=countofStrings.stringcount(" ","","","");
        assertEquals(null,result);
    }


}