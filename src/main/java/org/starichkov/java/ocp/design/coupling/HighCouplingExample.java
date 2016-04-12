package org.starichkov.java.ocp.design.coupling;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov
 * @since 03.04.2016 20:57
 */
public class HighCouplingExample implements RunnableExample {
    @Override
    public void run() {
        System.out.println("High coupling is a very bad thing!");

        A a = new A();
        B b = new B();
        a.doSomethingNasty(b);
        b.doSomethingNasty(a);

        System.out.println(a.a);
        System.out.println(b.b);
    }

    public class A {
        public int a;

        public void doSomethingNasty(B b) {
            b.b = 100500;
        }
    }

    public class B {
        public int b;

        public void doSomethingNasty(A a) {
            a.a = 10;
        }
    }
}
