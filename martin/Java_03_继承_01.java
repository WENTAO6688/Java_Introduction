package com.martin;

public class Java_03_继承_01 {
    //定义类的成员变量 age 和 name
    public int age = 10;
    public String name = "Animal";
    // 定义一个构造方法
    public void speak(){

        System.out.println(name + age + "具有说话的功能!");
    }
    // 构造一个对象
    public Java_03_继承_01(){

        System.out.println("Animal 执行了！");
        age = 25;
    }
}

