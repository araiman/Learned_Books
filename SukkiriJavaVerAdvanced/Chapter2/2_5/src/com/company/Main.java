package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // 練習 2-1
        /*
        // Date型の日時の取得
        Date now = new Date();

        // Date型の日時をカレンダーにセット
        Calendar c = Calendar.getInstance();
        c.setTime(now);

        // 100日足して、Calenderにセット
        int today = c.get(c.DAY_OF_MONTH);
        int todayPlusHunderd = today + 100;
        c.set(c.DAY_OF_MONTH, todayPlusHunderd);

        // Date型にして、フォーマットをかけ、表示。
        Date nowPlusHunderdDays = c.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(simpleDateFormat.format(nowPlusHunderdDays));
        */

        // 練習 2-2
        LocalDate localDate = LocalDate.now();
        LocalDate todayPlusHundredDays = localDate.plusDays(100);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(formatter.format(todayPlusHundredDays));
    }
}
