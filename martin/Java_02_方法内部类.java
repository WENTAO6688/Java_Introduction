package com.martin;

public class Java_02_方法内部类 {

    private String name = "你好吗？";
    // 定义一个外部类中的方法

    public void call(){
    // 定义方法内部类
        class Inner {
            int a = 10;
            int b = 40;

            public int getScore(){
                return a + b;
            }
        }
        // 创建方法类的对象
        Inner hey = new Inner();
        int newScore = hey.getScore();
        System.out.println("分数为： " + newScore);
    }
}
