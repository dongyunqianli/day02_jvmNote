package com.atguigu.java2;

public class ArrayTest {
    public static void main(String[] args) {
        Object[] arr=new Object[10];
        System.out.println(arr);//[Ljava.lang.Object;@14ae5a5

        String[] arr1=new String[10];
        System.out.println(arr1);//[Ljava.lang.String;@7f31245a

        long[][] arr2=new long[10][];
        System.out.println(arr2);//[[J@6d6f6e28
    }
}
