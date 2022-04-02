package com.atguigu.java16_referenceTest;

/**
 * 强引用的测试
 */
public class StrongReferenceTest {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("hello, atguigu");
        StringBuffer str1=str;
        str=null;
        System.gc();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str1);
    }
}
