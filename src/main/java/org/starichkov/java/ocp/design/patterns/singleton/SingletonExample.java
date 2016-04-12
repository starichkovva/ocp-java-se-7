package org.starichkov.java.ocp.design.patterns.singleton;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov
 * @since 03.04.2016 21:16
 */
public class SingletonExample implements RunnableExample {
    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getName());
    }
}
