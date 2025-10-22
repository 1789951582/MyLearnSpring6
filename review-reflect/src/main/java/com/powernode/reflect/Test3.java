package com.powernode.reflect;

import java.lang.reflect.Method;

public class Test3 {
    public static void main(String[] args) throws Exception{
        //获取类
        Class<?> aClass = Class.forName("com.powernode.reflect.SomeService");

        //获取方法
        Method doSome = aClass.getDeclaredMethod("doSome", String.class);

        //调用方法
        Object obj = aClass.newInstance();
        Object refVal = doSome.invoke(obj, "小李");

        System.out.println(refVal);
    }
}
