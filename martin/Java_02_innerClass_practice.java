package com.martin;

// 定义外部类

public class Java_02_innerClass_practice {
    // 定义一个内部类
    public class Outer {

        // 定义一个内部类的构造方法
        public void call(){

            System.out.println("I love Sun Tangtang!");

        }
    }

    //通过主函数来调用外部类
    public static void main(String[] args){

        Java_02_innerClass_practice use = new Java_02_innerClass_practice();

        /* 建立内部类的调用方法 */
        Outer m = use.new Outer();

        m.call();
    }
}
