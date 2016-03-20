package org.starichkov.java.ocp.exceptions;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov
 * @since 20.03.2016 22:29
 */
public class RethrowExample implements RunnableExample {
    @Override
    public void run() throws NullPointerException {
        try {
            String s = null;
            System.out.println(s.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("catch NullPointerException block");
            throw e;
        } finally {
            System.out.println("Finally block");
        }
    }
}
