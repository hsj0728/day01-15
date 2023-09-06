package com.atguigu.ext.demo01;

public class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat () {
        System.out.println("吃东东");
    }

    public void sleep() {
        System.out.println("睡觉觉");
    }

    public void lookHome() {
        System.out.println("看家");
    }
}
