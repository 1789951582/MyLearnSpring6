package com.powernode.spring6.bean;

public class Student {

    private String name;

    private Clazz clazz;

    //使用级联属性赋值，这个需要使用这个get方法。
    public Clazz getClazz() {
        return clazz;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public void setName(String name) {
        this.name = name;
    }
}
