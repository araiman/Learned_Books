package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class TryIterator {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("湊");
        names.add("朝香");
        names.add("菅原");

        java.util.Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String content = iterator.next();
            System.out.println(content);
        }

    }
}
