package com.atguigu.java1;

/**
 * 演示栈中的异常,Exception in thread "main" java.lang.StackOverflowError
 *
 * 默认情况下：11403
 * 设置栈的大小： -Xss256k 2460
 *
 */

public class StackErrorTest {
    private static int count=1;
    public static void main(String[] args){
        System.out.println(count);
        count++;
        main(args);
    }
}
