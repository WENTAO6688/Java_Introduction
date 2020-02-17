package com.martin;

public class Java_01_entry_1 {

    float black;
    float white;
    float yellow;


    public Java_01_entry_1() {

        System.out.println("无参的构造方法执行了！");

        }
    // 有参的构造方法，将变量的值放入函数中
    public Java_01_entry_1(float newBlack, float newWhite, float newYellow){

        black = newBlack;
        white = newWhite;
        yellow = newYellow;
        System.out.println("有参的构造方法执行了");
        System.out.println("black: " + newBlack + "white: " + newWhite + "yellow: " + newYellow);
    }
}

