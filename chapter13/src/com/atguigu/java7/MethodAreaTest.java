package com.atguigu.java7;

/**
 * non-final的类变量
 * 全局常量 static final
 */
public class MethodAreaTest {
    public static void main(String[] args) {
        Order order=null;
        order.hello();
        System.out.println(order.count);
    }
}
class Order{
    public static int count=1;
    public static final int number=2;
    public static void hello(){
        System.out.println("hello?");
    }
}