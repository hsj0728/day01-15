package com.atguigu.poly.demo07;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁" + getColor() + "色的小猫正在吃" + something);
    }

    public void catchMouse () {
        System.out.println(getAge() + "岁" + getColor() + "色的小猫正在抓老鼠");
    }
}
