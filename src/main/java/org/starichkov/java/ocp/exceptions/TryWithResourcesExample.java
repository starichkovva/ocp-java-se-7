package org.starichkov.java.ocp.exceptions;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov (SimbirSoft)
 * @since 21.03.2016 13:57
 */
public class TryWithResourcesExample implements RunnableExample {

    private static class FirstCloseable implements AutoCloseable {
        FirstCloseable() {
            System.out.println("FirstCloseable()");
        }

        @Override
        public void close() {
            System.out.println("FirstCloseable close()");
        }
    }

    private static class SecondCloseable implements AutoCloseable {
        SecondCloseable() {
            System.out.println("SecondCloseable()");
        }

        @Override
        public void close() {
            System.out.println("SecondCloseable close()");
        }
    }

    @Override
    public void run() {
        try (AutoCloseable first = new FirstCloseable(); AutoCloseable second = new SecondCloseable()) {
            System.out.println("Try");
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
    }
}
