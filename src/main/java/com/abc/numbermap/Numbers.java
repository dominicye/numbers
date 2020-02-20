package com.abc.numbermap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Numbers {

    private static final Map<String, String> numbersMap = new HashMap<>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public void doCombain(String combainStr, String numbers, List<String> resultList) {
        if (numbers.length() == 0) {
            resultList.add(combainStr);
        } else {
            String number = numbers.substring(0,1);
            String letters = numbersMap.get(number);

            for (int i =0 ; i< letters.length(); i++) {
                String letter = numbersMap.get(number).substring(i, i+1);
                doCombain(combainStr + letter, numbers.substring(1), resultList);
            }
        }
    }

    public List<String> getCombainedStr(String numbers, List<String> resultList) {
        if (numbers.length() != 0) {
            doCombain("", numbers , resultList);
        }
        return resultList;
    }
}
