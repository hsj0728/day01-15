package com.atguigu.abs.demo04;

public class AbstractDemo04 {
    public static void main(String[] args) {
        //创建Cat对象
        Cat cat = new Cat("Tom", 2);
        cat.catchMouse();
        cat.eat();
        cat.sleep();

        System.out.println("===================================");

        //创建Dog对象
        Dog dog = new Dog("TwoHa", 3);
        dog.lookHome();
        dog.eat();
        dog.sleep();
    }
}
