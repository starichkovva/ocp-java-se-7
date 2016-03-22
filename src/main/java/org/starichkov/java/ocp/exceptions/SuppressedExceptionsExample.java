package org.starichkov.java.ocp.exceptions;

import org.starichkov.java.ocp.RunnableExample;
import org.starichkov.java.ocp.exceptions.suppressed.FirstCloseable;
import org.starichkov.java.ocp.exceptions.suppressed.SecondCloseable;

/**
 * @author Vadim Starichkov (SimbirSoft)
 * @since 21.03.2016 14:16
 */
public class SuppressedExceptionsExample implements RunnableExample {
    @Override
    public void run() {
        try (AutoCloseable first = new FirstCloseable(); AutoCloseable second = new SecondCloseable()) {
            LOGGER.info("Try");
            throw new NullPointerException("Shit happens.");
        } catch (Exception e) {
            LOGGER.error("Catch", e);
        } finally {
            LOGGER.info("Finally");
        }
    }
}
