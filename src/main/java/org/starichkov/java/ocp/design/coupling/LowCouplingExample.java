package org.starichkov.java.ocp.design.coupling;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov
 * @since 03.04.2016 21:01
 */
public class LowCouplingExample implements RunnableExample {
    @Override
    public void run() {
        System.out.println("Low coupling is a great thing!");

        A a = new A();
        B b = new B();
        a.doItTheRightWay(b);
        b.doItTheRightWay(a);

        System.out.println(a.getA());
        System.out.println(b.getB());
    }

    class A {
        private int a;

        int getA() {
            return a;
        }

        void setA(int a) {
            this.a = a;
        }

        void doItTheRightWay(B b) {
            b.setB(100500);
        }
    }

    class B {
        private int b;

        int getB() {
            return b;
        }

        void setB(int b) {
            this.b = b;
        }

        void doItTheRightWay(A a) {
            a.setA(10);
        }
    }
}
