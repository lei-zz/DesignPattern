package com.zz.singleton;

public class SingletonLazy {

    private static SingletonLazy uniqueInstance;

    private SingletonLazy() {
    }

    public static SingletonLazy getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonLazy();
        }
        return uniqueInstance;
    }
}