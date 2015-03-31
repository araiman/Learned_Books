package com.company;

public class Main {

    public static void main(String[] args) {
        /* 1.3.2 StringBuilderを用いた連結 */
        StringBuilder sb = new StringBuilder();

        sb.append("Java");
        sb.append(" and");
        sb.append(" JavaScript");

        String s = sb.toString();

        System.out.println(s);


        /* String・Char配列・byte配列の相互変換 */
        String str = "こんにちはJava";
        char[] data1 = str.toCharArray();
        byte[] data3 = str.getBytes(java.nio.charset.Charset.forName("utf-8"));
        byte[] data2 = str.getBytes();

        System.out.println(data1);
        System.out.println(data1[0]);
        System.out.println(data2);
        System.out.println(data3);
    }
}
