package com.atguigu.java;

public class DeadThreadTest {
    public static void main(String[] args){
        Runnable r=()->{
            System.out.println(Thread.currentThread().getName()+"start");
            DeadThread dead=new DeadThread();
            System.out.println(Thread.currentThread().getName()+"end");
        };
        Thread t1=new Thread(r,"线程1");
        Thread t2=new Thread(r,"线程2");
        t1.start();
        t2.start();
    }
}
class DeadThread{
    static{
        if(true){
            System.out.println(Thread.currentThread().getName()+"初始化当前类");
            while(true){

            }
        }
    }
}