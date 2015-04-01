package com.company;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    // リスト2-1
        /*
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());

        Date past = new Date(1427835870330L);
        System.out.println(past);
        */


        // リスト2-2
        Instant i1 = Instant.now();
        System.out.println(i1);

        Instant i2 = Instant.ofEpochMilli(1427835870330L);
        long l  = i2.toEpochMilli();

        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.of(2014, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
        System.out.println("東京" + z1.getYear() + z1.getMonth() + z1.getDayOfMonth());
        System.out.println(z1.getMonth().toString());

    }
}
