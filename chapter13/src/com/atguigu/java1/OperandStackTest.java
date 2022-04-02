package com.atguigu.java1;

public class OperandStackTest {
    public void testAddOperation(){
        byte i=15;
        int j=8;
        int k=i+j;

    }
    public int getSum(){
        int m=10;
        int n=20;
        int k=m+n;
        return k;
    }
    public void testGetSum(){
        //获取上一个栈帧返回的结果，并保存在操作数栈中
        int i=getSum();
        int j=10;
    }
    /*区别
    i++;
    ++i;
     */
    public void add(){
        //第一类问题
        int i1=10;
        System.out.println(i1++);
        int i2=10;
        System.out.println(++i2);
        //第二类问题
        int i3=10;
        int i4=i3++;
        System.out.println(i4);
        int i5=10;
        int i6=++i5;
        System.out.println(i6);
        //第三类问题
        int i7=10;
        i7=i7++;
        System.out.println(i7);
        int i8=10;
        i8=++i8;
        System.out.println(i8);
        //第四类问题
        int i9=10;
        int i10=i9++ + ++i9;
        System.out.println(i10);
    }

}
