package com.atguigu.abs.demo04;
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getAge() + "岁的" + getName() + "正在吃骨头");
    }

    public void lookHome () {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }
}