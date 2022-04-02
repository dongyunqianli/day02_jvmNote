package com.atguigu.java1;

/**
 * 方法结束的方式分为两种
 * 1）正常结束，以return为代表
 * 2）方法执行中出现未捕获处理的异常，以抛出异常的方式结束
 */
public class StackFrameTest {
    public static void main(String[] args) {
        try {
            StackFrameTest test=new StackFrameTest();
            test.method1();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("main正常结束1");


    }
    public void method1(){
        System.out.println("method1()start....");
        method2();
        System.out.println("method1()end....");
//        System.out.println(10/0);
    }

    public int method2() {
        System.out.println("method2()start....");
        int i=10;
        int m = (int) method3();
        System.out.println("method2()即将结束....");
        return i+m;
    }

    public double method3() {
        System.out.println("method3() start....");
        double j=20.0;
        System.out.println("method3() 即将结束....");
        return j;
    }
}
