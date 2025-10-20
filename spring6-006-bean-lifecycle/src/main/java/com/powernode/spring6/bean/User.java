package com.powernode.spring6.bean;

/**
 * Bean的生命周期按照粗略的五步的话：
 * 第一步：实例化Bean（调用无参数构造方法）
 * 第二步：给Bean属性赋值（调用set方法）
 * 第三步：初始化Bean（会调用Bean的init方法。注意：这个init方法需要自己写，自己配。）
 * 第四步：使用Bean
 * 第五步：销毁Bean（会调用Bean的destroy方法。注意：这个destory方法需要自己写。自己配。）
 */
public class User {
    private String name;

    public void setName(String name) {
        System.out.println("第二步：给对象的属性赋值。");
        this.name = name;
    }

    public User() {
        System.out.println("第一步，无参数构造方法执行");
    }

    //这个方法需要自己写，自己配，方法名随意
    public void initBean(){
        System.out.println("第三步：初始化Bean");
    }

    //这个方法需要自己写。自己配。方法名随意。
    public void destroyBean(){
        System.out.println("第五步：销毁Bean");
    }
}
