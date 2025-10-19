package com.powernode.factory.method;

abstract public class WeaponFactory {

    /**
     * 这个方法不是静态的，是实例方法
     * @return
     */
    public abstract Weapon get();
}
