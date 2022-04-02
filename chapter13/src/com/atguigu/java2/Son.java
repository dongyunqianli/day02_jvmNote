package com.atguigu.java2;

/**
 * 解析调用时中非虚方法，虚方法的测试
 * invokestatic指令和invokespecial指令调用的方法称为虚方法
 */
class Father{
    public Father(){
        System.out.println("father");
    }
    public static void showStatic(String str){
        System.out.println("father "+str);
    }
    public final void showFinal(){
        System.out.println("father show final");
    }
    public void showCommon(){
        System.out.println("father common method");
    }

}

public class Son extends Father{
    // invokespecial
    public Son(){super();}
    // invokespecial
    public Son(int age){
        this();
    }
    public static void showStatic(String str){
        System.out.println("son"+str);
    }
    private void showPrivate(String str){
        System.out.println("son private "+str);
    }
    public void show(){
        // invokestatic
        showStatic("atguigu.com");
        // invokestatic
        super.showStatic("good");
        // invokespecial
        showPrivate("hello");
        // invokespecial
        super.showCommon();

        /*invokevirtual */
        showFinal();//此方法声明有final，不能被子类重写，所以也认为此方法是非虚方法

        //虚方法如下：
        //invokevirtual
        showCommon();
        //invokevirtual
        info();

        //invokeinterface
        MethodInterface in =new Method();
        in.methodA();
    }
    public void info(){

    }
    public void display(Father f){f.showCommon();}

    public static void main(String[] args) {
        Son so=new Son();
        so.show();
    }
}
interface MethodInterface{
    void methodA();
}
class Method implements MethodInterface{

    @Override
    public void methodA() {
        System.out.println("Method implements MethodInterface of methodA()... ");
    }
}