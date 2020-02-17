package com.martin;

public class Java_01_entry_try {

    public static void main(String[] args){

        // 定义构造方法
        Java_01_entry use = new Java_01_entry();

        //
        use.call();

        use.hello();
        // 定义有参数的构造方法
        // 即在方法内部设置变量的初始值
        use.height = 80f;
        use.length = 20f;
        use.weight = 140f;
        use.hello();
    }
}


