package com.atguigu.ext.demo02;

public class ExtendsDemo02 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("Tom");
        cat.setAge(2);

        cat.catchMouse();
        cat.eat();
        cat.sleep();

        System.out.println("============================");

        Dog dog = new Dog();
        dog.setName("TwoHa");
        dog.setAge(3);

        dog.lookHome();
        dog.eat();
        dog.sleep();

    }
}