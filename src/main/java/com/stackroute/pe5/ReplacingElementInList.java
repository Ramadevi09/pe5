package com.stackroute.pe5;

import java.util.ArrayList;

public class ReplacingElementInList {

    public ArrayList<String> updateElements(int index,String word,ArrayList list1){
        if(list1.isEmpty()){
            return null;
        }
        else {
            list1.set(index,word);
        }


       return list1;
    }

}
