package com.martin;

public class Java_01_static_initial {

    int num1;
    int num2;
    static int num3;

    // 定义构造方法,将为为后一步才去执行
    public Java_01_static_initial(){
        num1 = 1;
        System.out.println("通过构造方法得到的值为： "+ num1);
    }
    // 初始化模块
    {
        num2 = 2;
        System.out.println("通过初始化得到的值为：" + num2);
    }
    // 静态化初始变量
    static {
        num3 = 3;
        System.out.println("通过静态初始化块为静态变量： " + num3);
    }
    public static void main(String[] args){

        Java_01_static_initial define = new Java_01_static_initial();
        System.out.println(define.num1);
        System.out.println(define.num2);
        System.out.println(num3);
        Java_01_static_initial define2 = new Java_01_static_initial();
    }

}
