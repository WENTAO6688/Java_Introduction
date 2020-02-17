package com.martin;

public class Java_01_static {

    static String name = "martin";
    static int a = 8;

    public static void main(String[] args){

        // 通过类名直接进行访问静态变量
        System.out.println(Java_01_static.name);
        System.out.println(Java_01_static.a);

        // 通过构造对象
        Java_01_static function = new Java_01_static();

        System.out.println(function.name);
    }
}
