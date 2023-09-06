package com.atguigu.ext.demo02;

public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void eat () {
        System.out.println("吃东东");
    }

    public void sleep () {
        System.out.println("睡觉觉");
    }
}
