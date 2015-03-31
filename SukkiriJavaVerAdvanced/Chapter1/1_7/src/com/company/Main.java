package com.company;

public class Main {
    public static void main(String[] args) {
        // 練習問題 1-1
        /*
        StringBuilder stringBuilder = new StringBuilder();
        String[] a;

        for (int i = 1;i <= 100; i++) {
            stringBuilder.append(i+",");
        }

        // String Builder型の文字列をString型に変換する
        String s = stringBuilder.toString();

        // Stringを分割して、配列に格納する
        a = s.split(",");

        for (int i = 0; i <100; i++) {
            System.out.println(a[i]);
        }
        */


        // 練習問題 1-2(自分の回答)
        /*
        String folder = "c:¥javadev";
        String file = "readme.txt";
        String s;

        // 文字列の連結。最後が、「¥」の場合と、そうでない場合で場合分け。
        if (folder.matches("¥$")) {
            //　そのまま連結する
            s = folder + file;
        } else {
            // 「¥」を加えてから連結する。
            s = folder + "¥" + file;
        }
        System.out.println(s);
        */


        // 練習問題 1-2(模範解答)
        /*
        String folder = "c:¥javadev";
        String file = "readme.txt";
        String s;

        if (! folder.endsWith("¥¥")) {
            folder += "¥¥";
        }

        System.out.println(folder + file);
        */
    }
}
