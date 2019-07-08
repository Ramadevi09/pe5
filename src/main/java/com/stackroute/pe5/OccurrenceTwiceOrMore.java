package com.stackroute.pe5;

import java.util.*;
            public class OccurrenceTwiceOrMore {
                public Map<String, Boolean> checkStringRepeat(String[] input) {

                    Map<String, Boolean> resultMap = new HashMap<>();

                    if (input == null) {
                        return null;
                    } else {

                        for (int i = 0; i < input.length; i++) {

                            String word = input[i];
                            if (resultMap.containsKey(word))
                                resultMap.put(word, true);
                            else
                                resultMap.put(word, false);
                        }
                        return resultMap;
                    }
                }
            }





