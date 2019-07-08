package com.stackroute.pe5;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountofStrings {
    int num1 = 0, num2 = 0, num3 = 0;
    public Map stringcount(String str,String input1,String input2,String input3){
        if(str==null || str==" "){
            return null;
        }
        else {
            // Create a pattern to be searched
            Pattern pattern1 = Pattern.compile(input1);
            // Search above pattern in "She sells seashells by the seashore"
            Matcher m1 = pattern1.matcher(str);
            //for two counting
            Pattern pattern2 = Pattern.compile(input2);
            Matcher m2 = pattern2.matcher(str);
            //for three counting
            Pattern pattern3 = Pattern.compile(input3);
            Matcher m3 = pattern3.matcher(str);

            while (m1.find()) {
                num1++;
            }
            while (m2.find()) {
                num2++;
            }
            while (m3.find()) {
                num3++;
            }
        }

Map<String,Integer> map=new HashMap<>();
        map.put(input1,num1);
        map.put(input2,num2);
        map.put(input3,num3);
return map;
    }
}
