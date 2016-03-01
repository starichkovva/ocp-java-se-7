package org.starichkov.java.ocp.formatting;

import org.starichkov.java.ocp.RunnableExample;

import java.util.Date;

/**
 * @author Vadim Starichkov
 * @since 29.02.2016 23:04
 */
public class DateExample implements RunnableExample {
    @Override
    public void run() {
        Date now = new Date();
        LOGGER.info("Current date/time: {}", now);
        LOGGER.info("Current date/time as milliseconds: {}", now.getTime());
    }
}
