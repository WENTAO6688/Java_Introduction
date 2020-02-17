package com.martin;

public class Java_03_继承_01_测试 {

    public static void main(String[] args){

        Java_03_继承_01 dog = new Java_03_继承_01();
        System.out.println("animal age: " + dog.age);

        dog.age = 5;
        dog.name = "xiaohan";
        dog.speak();
    }
}
