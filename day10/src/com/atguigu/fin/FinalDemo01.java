package com.atguigu.fin;

public class FinalDemo01 {
    public static void main(String[] args) {
        final int NUM1 = 123;

        final int NUM2;

        byte b1 = 3;
        byte b2 = 4;
        byte b3 = 3 + 4;//将运算由运行时期提前至编译时期

        final byte VAR1 = 3;
        final byte VAR2 = 4;
        byte sum = VAR1 + VAR2;

        final byte VAR3;
        VAR3 = 3;
        final byte VAR4;
        VAR4 = 4;

    }

    public static void method (final int NUM) {}
}
