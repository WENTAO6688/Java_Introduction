package com.martin;

// 定义一个外部类
public class Java_02_inner_class {

    // 定义一个内部类

    public class Inner{

        // 构造内部类的使用方法

        public void show(){

            System.out.println("welcome to imooc!");
        }
    }

    // 使用主函数调用外部类

    public static void main(String[] args){

        Java_02_inner_class hello = new Java_02_inner_class();
        // 定义内部类

        Inner i = hello.new Inner();

        i.show();

    }



}
