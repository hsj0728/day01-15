package com.atguigu.sta.demo05;

public class ArrayUtils {
    public static void print(int... arr){
    if (arr == null){
        System.out.println("程序有误：数组为null，无法进行打印");
        return;
    }

    if (arr.length == 0){
        System.out.println("数组【】");
        return;
    }

    System.out.print("数组：【");

    for (int i = 0;i < arr.length;i++){
        if (i == arr.length -1 ) {
            System.out.println(arr[i] + "]");
        }else{
            System.out.print(arr[i] +",");
        }
    }
    }
}
