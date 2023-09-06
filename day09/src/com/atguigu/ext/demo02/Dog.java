package com.atguigu.ext.demo02;

public class Dog extends Animal {
    public Dog() {
    }

    //狗的特有方法
    public void lookHome () {
        System.out.println(getAge() + "岁的" + getName() + "正在看家");
    }
}
