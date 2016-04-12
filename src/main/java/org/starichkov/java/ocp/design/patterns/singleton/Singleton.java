package org.starichkov.java.ocp.design.patterns.singleton;

/**
 * @author Vadim Starichkov
 * @since 03.04.2016 21:17
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private final String name;

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public String getName() {
        return name;
    }

    private Singleton() {
        name = "Simple singleton!";
    }
}
