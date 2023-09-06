package com.atguigu.ext.demo08;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public void eat () {
        System.out.println(getAge() + "岁的" + getName() + "正在吃shit");
    }

    public void lookHome () {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }

}
