package com.atguigu.java11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *  -XX:StringTableSize=1009
 */
public class StringTest2 {
    public static void main(String[] args) {
        //测试StringTableSize参数
//        System.out.println("我来打个响指");
//        try {
//            Thread.sleep(1000000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }



        BufferedReader br= null;
        try {
            br = new BufferedReader(new FileReader("words.txt"));
            long start=System.currentTimeMillis();
            String data;
            while((data=br.readLine())!=null){
                data.intern();//如果字符串常量池总没有对应data的字符串的话，则在常量池中生成
            }
            long end=System.currentTimeMillis();
            System.out.println("花费的时间为: "+(end-start));//1009:436ms 100009:71ms
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br!=null)
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
