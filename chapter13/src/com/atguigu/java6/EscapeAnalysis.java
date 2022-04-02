package com.atguigu.java6;

/**
 * 逃逸分析
 *  new的对象实体  是否有可能在方法外被调用
 */
public class EscapeAnalysis {
    public EscapeAnalysis obj;
    /*方法返回 EscapeAnalysis对象，发生逃逸*/
    public EscapeAnalysis getInstance(){
        return obj==null?new EscapeAnalysis():obj;
    }
    /*为成员属性赋值，发生逃逸*/
    public void setObj(){
        this.obj=new EscapeAnalysis();
    }
    /*对象的作用域进在当前方法中有效，没有发生逃逸*/
    public void useEscapeAnalysis(){
        EscapeAnalysis e=new EscapeAnalysis();
    }
    /*引用成员变量的值，发生逃逸*/
    public void useEscapeAnalysis1(){
        EscapeAnalysis e=getInstance();
        //getInstance().xxx() 同样会发生逃逸
    }

}
