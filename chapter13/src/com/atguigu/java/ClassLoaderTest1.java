//package com.atguigu.java;
//
//import sun.misc.Launcher;
//import sun.security.ec.CurveDB;
//
//import java.net.URL;
//import java.security.Provider;
//
//public class ClassLoaderTest1 {
//    public static void main(String[] args){
//        System.out.println("***********启动类加载器************");
//        //获取BootstrapClassLoader能够加载的api的路径
//        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
//        for(URL element: urLs){
//            System.out.println(element.toExternalForm());
//        }
//        //从上面的路径中随意选择一个类，来看看它的 类加载器 是什么-->引导类加载器
//        ClassLoader classLoader = Provider.class.getClassLoader();
//        System.out.println(classLoader);
//
//
//        System.out.println("*************扩展类加载器*****************");
//        String extDirs = System.getProperty("java.ext.dirs");
//        for(String path:extDirs.split(";")){
//            System.out.println(path);
//        }
//
//        //从上面的路径中随意选择一个类，来看看它的 类加载器 是什么-->扩展类加载器
//        ClassLoader classLoader1 = CurveDB.class.getClassLoader();
//        System.out.println(classLoader1);//sun.misc.Launcher$ExtClassLoader@29453f44
//    }
//}
