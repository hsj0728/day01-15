package com.atguigu.ext.demo01;

public class Cat {
    private String name;
    private int age;

    public Cat() {
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat () {
        System.out.println("吃东东");
    }

    public void sleep() {
        System.out.println("睡觉觉");
    }

    public void catchMouse () {
        System.out.println("抓老鼠");
    }
}
