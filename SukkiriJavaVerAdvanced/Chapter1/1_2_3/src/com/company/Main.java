package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "Java and JavaScript";
        System.out.println("４文字目");
        System.out.println(s.charAt(4));
        System.out.println("5文字目以降");
        System.out.println(s.substring(5));
        System.out.println("空白の除去");
        System.out.println(s.trim());
        System.out.println("文字列の置き換え");
        System.out.println(s.replace("a", "s"));
    }
}
