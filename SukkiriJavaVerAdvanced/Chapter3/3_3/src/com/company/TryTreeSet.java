package com.company;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by RyomaArai on 15/04/05.
 */
public class TryTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();

        treeSet.add("Hello");
        treeSet.add("Thankyou");
        treeSet.add("Hoge");

        Iterator<String> iterator = treeSet.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String content : treeSet) {
            System.out.println(content);
        }
    }
}
