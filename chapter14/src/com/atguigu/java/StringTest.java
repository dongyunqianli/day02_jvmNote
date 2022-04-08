package com.atguigu.java;

public class StringTest {
    public static void main(String[] args) {
        String str=new String("hello")+new String("world");
        String str1="helloworld";
        System.out.println(str==str1);
        String str2=new String("helloworld");
        System.out.println(str==str2);
    }
    public void method1(){}
    public void method1(int num){

    }
    public int method2(int num){
        return 1;
    }
}
