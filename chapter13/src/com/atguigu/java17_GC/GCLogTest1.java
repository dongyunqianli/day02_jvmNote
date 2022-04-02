package com.atguigu.java17_GC;

/**
 * -verbose:gc -Xms20m -Xmx20m -Xmn10m -XX:PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC
 */
public class GCLogTest1 {
    private static final int _1MB=1024*1024;
    public static void testAllocation(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1=new byte[2* _1MB];
        allocation1=new byte[2* _1MB];
        allocation1=new byte[2* _1MB];
        allocation1=new byte[4* _1MB];
    }
    public static void main(String[] args){testAllocation();}
}
