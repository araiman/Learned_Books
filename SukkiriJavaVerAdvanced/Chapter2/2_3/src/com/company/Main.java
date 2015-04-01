package com.company;

import java.time.LocalDate;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        // リスト 2-4
        /*
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        */

        // リスト 2-5
        /*
        LocalDate d1 = LocalDate.of(2012,1,1);
        LocalDate d2 = LocalDate.of(2012,1,4);

        Period p1 = Period.ofDays(3);
        Period p2 = Period.between(d1,d2);

        System.out.println(p1);
        System.out.println(p2);

        LocalDate d3 = d2.plus(p2);
        System.out.println(d3);
        */
    }
}
