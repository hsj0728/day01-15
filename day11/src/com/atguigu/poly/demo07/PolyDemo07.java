package com.atguigu.poly.demo07;

public class PolyDemo07 {
    public static void main(String[] args) {
        //创建猫对象
        Animal cat = new Cat(2, "白");

        //cat.catchMouse();
        cat.eat("鱼");
        cat.sleep();

       /*
       demo08
       //创建猫对象
        Animal tom = new Cat(2, "白");

        //进行向下转型
        Cat cat = (Cat)tom;
        cat.catchMouse();

        System.out.println("======================================");

        //宏愿:狗抓老鼠(即将达成)

        //使用多态的形式创建狗对象
        Animal twoHa = new Dog(3, "黑");

        //将多态形式的狗对象向下转型为猫对象
        Cat c = (Cat)twoHa;

        //操作狗抓老鼠
        c.catchMouse();*/

       /*
       demo09
        //创建猫对象
        Animal tom = new Cat(2, "白");

        if (tom instanceof Cat) {
            //进行向下转型
            Cat cat = (Cat)tom;
            cat.catchMouse();
        } else {
            System.out.println("对象tom在内存中不是Cat类型,无法进行向下转型");
        }

        System.out.println("======================================");

        //宏愿:狗抓老鼠(即将达成)

        //使用多态的形式创建狗对象
        Animal twoHa = new Dog(3, "黑");

        if (twoHa instanceof Cat) {
            //将多态形式的狗对象向下转型为猫对象
            Cat c = (Cat)twoHa;

            //操作狗抓老鼠
            c.catchMouse();
        } else {
            System.out.println("对象twoHa在内存中不是Cat类型,无法进行向下转型");
        }

       */
    }
}
