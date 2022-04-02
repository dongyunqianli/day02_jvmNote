package com.atguigu.java13;

/**
 * 如何保证变量s指向的是字符串常量池中的数据
 *
 * way1：String s="shkstart";  //字面量定义的方式
 *
 * way2: 调用intern()
 *       String s=new String("shkstart").intern();
 *       String s=new StringBuilder("shkstart").toString().intern();
 */
public class StringIntern {
    public static void main(String[] args) {
        String s=new String("1");
        s.intern();//调用此方法前，字符串常量池中已经存在了 "1"
        String s2="1";
        System.out.println(s==s2);//
        String s3=new String("1")+new String("1");//s3变量记录的地址为：new String("11")
        //执行完上一行代码后，字符串常量池中不存在 "11"
        s3.intern();/*字符串常量池中生成 "11"
                       jdk6中，创建了一个新的对象"11",也就有了新的地址
                       jdk7中，此时常量池中并没有创建“11”，而是创建一个指向堆空间中new String("11")的地址*/
        String s4="11";//s4 变量记录的地址，使用的是上一行代码执行时，在常量池中生成的 "11" 的地址
        System.out.println(s3==s4);//true 地址相同
    }
}
