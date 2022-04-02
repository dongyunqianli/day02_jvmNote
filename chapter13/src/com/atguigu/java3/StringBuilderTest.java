package com.atguigu.java3;

/**
 * 方法中定义的局部变量是否线程安全，具体情况具体分析
 * 何为线程安全，
 *      如果只有一个线程才可以操作此数据，则是线程安全的
 *      如果有多个线程操作此数据，则此数据是共享的，如果不考虑同步机制的话，会存在线程安全问题
 *
 */
public class StringBuilderTest {
    int num=10;

    //s1的声明方式是线程安全的
    public static void method1(){
        //StringBuilder线程不安全
        StringBuilder s1=new StringBuilder();
        s1.append("a");
        s1.append("b");
        //...
    }
    /*sBuilder的操作过程，是线程不安全的*/
    public static void method2(StringBuilder sBuilder){
        sBuilder.append("a");
        sBuilder.append("b");
        //...
    }
    /*s1的操作,是线程不安全的*/
    public static StringBuilder method3(){
        StringBuilder s1=new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1;
    }

    //s1的操作,是线程安全的
    public static String method4(){
        StringBuilder s1=new StringBuilder();
        s1.append("a");
        s1.append("b");
        return s1.toString();
    }

    public static void main(String[] args){
        StringBuilder s=new StringBuilder();
        new Thread(()->{
            s.append("a");
            s.append("b");
        }).start();
        method2(s);


        method1();
        new Thread(){
            @Override
            public void run() {
                super.run();
            }
        };
    }
}
