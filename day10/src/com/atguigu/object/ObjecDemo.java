package com.atguigu.object;

class ObjectDemo {
    public static void main(String[] args) {
        //创建Student对象
        Student s = new Student();
        System.out.println(s);
        System.out.println(s.toString());

        System.out.println("===================================================");

        int[] ints = {11,22,33};
        System.out.println(ints);
        System.out.println(ints.toString());

        System.out.println("===================================================");

        char[] chars = {'a','b','c'};
        System.out.println(chars);
        System.out.println(chars.toString());

        System.out.println("===================================================");

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.equals(s2));

    }
}
