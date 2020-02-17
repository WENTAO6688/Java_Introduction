package com.martin;
// 外部类
public class Java_02_static_class {
    //定义外部类静态变量
     private static String name = "Wentao Ma";
    //定义外部类非静态成员变量
    private int age = 25;

    // 定义静态内部类
    public static class Inner{

        //定义内部类的成员变量
        int age = 20;

        public void test(){
            System.out.println("外部类的名字为： " + Java_02_static_class.name);
            System.out.println("访问内部类的年龄为： " + age);

        }

    }

    public static void main(String[] args){
        //
        //直接创建内部类的对象
        Inner get = new Inner();
        get.test();
    }


}
