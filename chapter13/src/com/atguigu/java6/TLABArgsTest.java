package com.atguigu.java6;

/**
 * TLAB:Thread Local Allocation Buffer
 * 测试-XX:UseTLAB参数是否开启的情况，默认是开启的
 */
public class TLABArgsTest {
    public static void main(String[] args) {
        System.out.println("我只是来打个酱油的");
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
