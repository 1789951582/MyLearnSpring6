package com.powernode.factory.method;

public class Test {
    public static void main(String[] args) {
        WeaponFactory daggerFactory = new DaggerFactory();
        Weapon dagger = daggerFactory.get();
        dagger.attack();

        WeaponFactory gunFactory = new GunFactory();
        Weapon gun = gunFactory.get();
        gun.attack();

    }
}
