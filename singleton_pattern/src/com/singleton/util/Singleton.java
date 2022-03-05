package com.singleton.util;

public class Singleton {
    private static Singleton instance;
    public int value;

    private Singleton(int value) {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException exe) {
            System.err.println(exe.getStackTrace());
        }

        this.value = value;
    }

    public static Singleton createInstance(int value) {
        if (instance == null) {
            instance = new Singleton(value);
            return instance;
        }
        else {
            return instance;
        }
    }
}
