package org.starichkov.java.ocp.formatting;

import org.starichkov.java.ocp.RunnableExample;

import java.util.Calendar;

/**
 * @author Vadim Starichkov
 * @since 29.02.2016 22:47
 */
public class CalendarExample implements RunnableExample {
    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_WEEK, 4);
        LOGGER.info("Added 4 days: {}", calendar.getTime());

        calendar.roll(Calendar.MONTH, 16);
        LOGGER.info("Rolled with 16 months: {}", calendar.getTime());
    }
}
