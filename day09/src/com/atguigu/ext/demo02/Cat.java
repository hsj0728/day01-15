package com.atguigu.ext.demo02;

public class Cat extends Animal {
    public Cat() {
    }

    //猫的特有方法
    public void catchMouse () {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }
}
