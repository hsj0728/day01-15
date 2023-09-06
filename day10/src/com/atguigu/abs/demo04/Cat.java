package com.atguigu.abs.demo04;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }

    public void catchMouse () {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }
}
