package com.martin;

public class Java_03_继承_super {

    private int age = 10;
    String name = "你好";

    // 定义一个构造方法
    public void print(){

        System.out.println("我今年" + age + "岁了" + "," + "我叫" + name);
    }

    // 定义一个对象
    public Java_03_继承_super(){

        System.out.println("上面那句话执行了");
        age = 25;

    }
}
