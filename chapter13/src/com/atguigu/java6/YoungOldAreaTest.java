package com.atguigu.java6;

/**
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=8 -XX:+PrintGCDetails
 */
public class YoungOldAreaTest {
    public static void main(String[] args){
        byte[] buffer=new byte[1024*1024*20];//eden:s0:s1:old=16m:2m:2m:40m
    }
}
