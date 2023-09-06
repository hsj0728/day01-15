package com.atguigu.ext.demo08;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    //重写父类的eat()
    public void eat () {
        System.out.println(getAge() + "岁的" + getName() + "正在吃鱼");
    }

    //猫的特有方法catchMouse()
    public void catchMouse () {
        System.out.println(getAge() + "岁的" + getName() + "正在抓老鼠");
    }

}
