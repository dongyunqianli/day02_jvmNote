package com.atguigu.java6;

/**
 * 同步省略
 */
public class SynchronizedTest {
    public void f(){
        Object hollis=new Object();
        synchronized(hollis){
            System.out.println(hollis);
        }
    }
}
