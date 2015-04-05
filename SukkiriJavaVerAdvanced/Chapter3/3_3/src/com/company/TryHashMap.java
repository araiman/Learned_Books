package com.company;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by RyomaArai on 15/04/05.
 */
public class TryHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Name", "Jiro");
        hashMap.put("Prefecture", "Fukushima");
        hashMap.put("Age", "20");
        hashMap.put("Tel", "09000000000");

        System.out.println(hashMap.keySet());

        for (String key : hashMap.keySet()) {
            System.out.println(hashMap.get(key));
        }
    }
}
