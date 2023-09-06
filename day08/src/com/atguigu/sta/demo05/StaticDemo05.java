package com.atguigu.sta.demo05;

public class StaticDemo05 {
    public static void main(String[] args) {
        //创建
        ArrayUtils au = new ArrayUtils();

        au.print();
        au.print(11,22,33);
        au.print(11,22,33,44);
        au.print(11,22,33,44,55);

        ArrayUtils.print(11,22,33);
        ArrayUtils.print(11,22,33,44);

        ArrayUtils.print(11,22,33,44,55);

    }
}
