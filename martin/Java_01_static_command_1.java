package com.martin;

public class Java_01_static_command_1 {

    // 定义静态与非静态成员变量
    String name = "Martin";
    static String feature = "handsome";
    /*
    不同的调用方法：
    1. 普通成员方法
    2. 静态方法
    3. 类名调用方法
     */
    //普通成员方法可以直接使用静态成员变量或非静态成员变量
    public void show(){
        System.out.println("my name is: " + name);
        System.out.println("the feasure is: " + feature);
    }

    // 静态方法只能调用静态成员变量
    public static void print(){
        System.out.println("i was so handsome!");
    }

    // 静态方法如果想调用非静态成员变量
    public static void main(String[] args){

        Java_01_static_command_1 hello = new Java_01_static_command_1();
        System.out.println("打印： " + hello.name);
        hello.show();
        print();
    }

}
