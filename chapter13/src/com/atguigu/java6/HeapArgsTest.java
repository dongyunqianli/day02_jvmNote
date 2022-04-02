package com.atguigu.java6;

/**
 * 测试堆空间常用的jvm参数
 * -XX:+PrintFlagsInitial:查看所有的参数的默认初始值
 * -XX:+PrintFlagsFinal:查看所有的参数的最终值
 *      具体查看某个参数的指令：jps：查看当前运行中的进程
 *                          jinfo -flag SurvivorRatio 进程id
 *
 * -Xms:初始堆空间内存（默认为是物理内存的1/64）
 * -Xmx:最大堆空间内存（默认为是物理内存的1/4）
 * -Xmn:设置新生代的大小（初始值及最大值）
 * -XX:NewRatio:配置新生代与老生代在 堆结构 的占比
 * -XX:SurvivorRatio:设置新生代中Eden和s0/s1空间的比例
 *
 * -XX:MaxTenuringThreshold:设置新生代垃圾袋最大年龄
 * -XX:+PrintGCDetails:输出详细的gc处理日志
 * 打印 gc 简要信息：-XX:+PrintGC -verbose:gc
 * -XX:HandlePromotionFailure:是否设置空间分配担保
 */
public class HeapArgsTest {
    public static void main(String[] args) {

    }
}
