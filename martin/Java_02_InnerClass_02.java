package com.martin;

// 外部类
public class Java_02_InnerClass_02 {

    // 定义外部类的成员变量

    private String name = "Wentao Ma";

    int age = 18;

    // 紧接着定义一个内部类
    public class Inner{

        // 定义内部类的成员变量
        int age = 25;
        String name = "爱慕课！";

        // 定义内部类中的构造方法
        public void test(){
            System.out.println("调用外部类的成员变量，名字为： " + Java_02_InnerClass_02.this.name);
            System.out.println("调用内部类的成员变量，名字为： " + name);
            System.out.println("调用内部类的成员变量，年龄为： " + age);
        }

        }
    public static void main(String[] args){
        // 首先调用外部类
        Java_02_InnerClass_02 hello = new Java_02_InnerClass_02();
        // 接下来调用内部类
        Inner h = hello.new Inner();
        h.test();

    }

}
