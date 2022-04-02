package com.atguigu.java8;

/**
 * 静态引用对应的对象实体始终都是存在 堆空间
 *
 * -Xms200m -Xmx200m -XX:MetaspaceSize=300m -XX:MaxMetaspaceSize=300m -XX:+PrintGCDetails
 */
public class StaticFieldTest {
    private static byte[] arr=new byte[1024*1024*100];//100MB

    public static void main(String[] args) {
        System.out.println(StaticFieldTest.arr);
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
