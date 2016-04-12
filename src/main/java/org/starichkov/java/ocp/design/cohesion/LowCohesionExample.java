package org.starichkov.java.ocp.design.cohesion;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov
 * @since 03.04.2016 21:06
 */
public class LowCohesionExample implements RunnableExample {
    @Override
    public void run() {
        System.out.println("Low cohesion is a very bad thing!");
        AllInOne one = AllInOne.create();
        one.print();
        one.save();
    }

    static class AllInOne {
        static AllInOne create() {
            return new AllInOne();
        }

        void print() {
            System.out.println(this);
        }

        void save() {
            System.out.println("Saving somewhere");
        }

        @Override
        public String toString() {
            return "AllInOne{ All-in-one low cohesion class }";
        }
    }
}
