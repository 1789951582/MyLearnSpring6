package com.powernode.reflect;

import java.lang.reflect.Method;

public class Test2 {

    public static void main(String[] args) throws Exception{
        //使用反射机制怎么调用方法
        //获取类
        Class<?> aClass = Class.forName("com.powernode.reflect.SomeService");

        //获取方法
        Method doSome = aClass.getDeclaredMethod("doSome", String.class, int.class);

        //调用方法
        //四要素：调用哪个对象的哪个方法、传什么参数、返回什么值。
        //obj 要素：哪个对象
        //doSomeMethod 要素：哪个方法
        //"李四"， 250 要素：传什么参数
        //retValue 要素：返回什么值
        Object obj = aClass.newInstance();
        Object retValue = doSome.invoke(obj, "小明", 26);
        System.out.println(retValue);
    }
}
