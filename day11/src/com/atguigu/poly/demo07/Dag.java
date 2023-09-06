package com.atguigu.poly.demo07;

public class Dag extends Animal {
    public Dag() {
    }

    public Dag(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁" + getColor() + "色的小狗正在吃" + something);
    }

    public void lookHome () {
        System.out.println(getAge() + "岁" + getColor() + "色的小狗正在看家");
    }
}
