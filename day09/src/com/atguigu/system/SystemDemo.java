package com.atguigu.system;

import java.util.Scanner;

public class SystemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        System.out.println("num=" + num);

        sc.close();
    }
}
