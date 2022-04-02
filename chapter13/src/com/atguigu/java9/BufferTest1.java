package com.atguigu.java9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferTest1 {
    private static final String TO="D:\\resourcePic\\video\\miss.mp4";
    private static final int _100Mb=1024*1024*100;
    public static void main(String[] args){
        long sum=0;
        String src="D:\\resourcePic\\video\\miss.mp4";
        for (int i = 0; i < 3; i++) {
            String dest="D:\\resourcePic\\video\\miss_"+i+".mp4";
//            sum+=io(src,dest);//45786
            sum+=directBuffer(src,dest);//36169
        }
        System.out.println("总花费的时间: "+sum);
    }
    private static long directBuffer(String src,String dest){
        long start=System.currentTimeMillis();
        FileChannel inChannel= null;
        FileChannel outChannel= null;
        try {
            inChannel = new FileInputStream(src).getChannel();
            outChannel = new FileOutputStream(dest).getChannel();
            ByteBuffer byteBuffer=ByteBuffer.allocateDirect(_100Mb);
            while(inChannel.read(byteBuffer)!=-1){
                byteBuffer.flip();//修改为读数据模式
                outChannel.write(byteBuffer);
                byteBuffer.clear();//清空
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(inChannel!=null)
                inChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(outChannel!=null)
                outChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end=System.currentTimeMillis();
        return end-start;

    }
    private static long io(String src,String dest) {
        long start =System.currentTimeMillis();
        FileInputStream fis= null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            byte[] buffer=new byte[_100Mb];
            while(true){
                int len=fis.read(buffer);
                if(len==-1){
                    break;
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fos!=null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long end =System.currentTimeMillis();
        return end-start;

    }
}























