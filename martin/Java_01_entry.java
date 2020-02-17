package com.martin;

public class Java_01_entry {

    /*
    定义成员变量 实例变量
     */

    float height;
    float weight;
    float length;
    int var;

    // 定义构造方法和函数
    void call(){
        // 定义一个无参数的构造方法
        int var  = 1;
        System.out.println("无参数的构造方法出现了");
        System.out.println(var);
    }

    void hello(){
        int var = 5;
        // 定义一个有参数的构造方法
        System.out.println(height + "有参数的构造方法出现了！");
        System.out.println(var);

    }

}
