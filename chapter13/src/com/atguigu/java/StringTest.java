package com.atguigu.java;

public class StringTest {
    public static void main(String[] args) {
        java.lang.String str = new java.lang.String();
        str="hello,atguigu.com";
        System.out.println(str);

        StringTest test=new StringTest();
        System.out.println(test.getClass().getClassLoader());//sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
