package com.atguigu.java2;

class Animal{
    public void eat(){
        System.out.println("动物进食");
    }
}
interface Huntable{
    void hunt();
}
class Dog extends Animal implements Huntable{
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
    @Override
    public void hunt(){
        System.out.println("狗拿耗子，多管闲事");
    }
}
class Cat extends Animal implements Huntable{
    public Cat(){
        super();//表现为：早期绑定
    }
    public Cat(String name){
        this();//表现为：早期绑定
    }
    @Override
    public void eat() {
        super.eat();//表现为：早期绑定
        System.out.println("猫吃鱼");
    }
    @Override
    public void hunt(){
        System.out.println("猫拿耗子，不算闲事");
    }
}

public class AnimalTest {
    public void showAnimal(Animal animal){
        animal.eat();//表现为：晚期绑定
    }
    public void showHunt(Huntable h){
        h.hunt();//表现为：晚期绑定
    }
}