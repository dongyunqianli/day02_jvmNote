package com.atguigu1.java2;

public class UserTest {
    public static void main(String[] args) {
        User user=new User();//隐式加载

        try {
            Class clazz = Class.forName("com.atguigu1.java2.User");
            ClassLoader.getSystemClassLoader().loadClass("com.atguigu1.java2.User");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
