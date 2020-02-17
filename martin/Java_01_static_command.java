package com.martin;

public class Java_01_static_command {

    // static 关键词声明静态方法
    public static void print(){

        System.out.println("I love you, China!");
    }

    // 直接使用类名来调用
    public static void main(String[] args){
        Java_01_static_command.print();

        // 通过构造对象名
        Java_01_static_command Java_function = new Java_01_static_command();
        Java_function.print();
    }

}
