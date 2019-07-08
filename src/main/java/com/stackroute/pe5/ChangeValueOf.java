package com.stackroute.pe5;

import java.util.Map;

public class ChangeValueOf {
    public Map<String,String> changeTheValueInTheMap(Map<String,String> newmap){
        for(Map.Entry<String,String> entry:newmap.entrySet())
        {
            if(entry.getKey().equals("val1")&&entry.getValue()!=null)
            {
                String value=entry.getValue();
                newmap.put("val1"," ");
                newmap.put("val2",value);
            }
            else {
                continue;
            }
        }
        return newmap;
    }
}
