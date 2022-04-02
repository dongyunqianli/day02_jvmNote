package com.atguigu.java7;

/**
 * 测试设置方法区大小参数的默认值
 * -XX:MetaspaceSize=100m -XX:MaxMetaspaceSize=100m
 */
public class MethodAreaDemo {
    public static void main(String[] args) {
        System.out.println("start........");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end......");
    }
}
