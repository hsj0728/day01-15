package com.atguigu.innerclass.demo01;
public class InnerClassDemo01 {
    public static void main(String[] args) {
        //使用多态的形式创建接口的实现类对象
        SuperInterface si1 = new SubClass();
        si1.method();

        System.out.println("=======================");

        SuperInterface si2 = new SuperInterface(){
            @Override
            public void method () {
                System.out.println("HelloWorld");
            }

        };

        System.out.println(si2);

        //多态对象调用方法
        si2.method();

       /* SuperInterface si3 = new SuperInterface(){
            @Override
            public void method() {
                System.out.println("HelloWorld");
            }
        };

        System.out.println(si3);*/
    }
}
