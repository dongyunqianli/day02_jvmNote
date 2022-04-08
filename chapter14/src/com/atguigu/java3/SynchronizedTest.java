package com.atguigu.java3;

public class SynchronizedTest {
    private int i=0;
    public void add(){i++;}
    private Object obj=new Object();
    public void subtract(){
        synchronized(obj){
            i--;
        }
    }
}
