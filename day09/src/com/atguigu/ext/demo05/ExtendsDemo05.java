package com.atguigu.ext.demo05;

public class ExtendsDemo05 {
    public static void main(String[] args) {
        System.out.println(SuperClass.num);
        SuperClass.method();

        System.out.println("===================");

        System.out.println(SubClass.num);
        SubClass.method();
    }
}
