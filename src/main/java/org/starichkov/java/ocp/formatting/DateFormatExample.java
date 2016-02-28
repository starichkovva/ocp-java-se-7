package org.starichkov.java.ocp.formatting;

import org.starichkov.java.ocp.RunnableExample;

import java.text.DateFormat;
import java.util.Date;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 19:11
 */
public class DateFormatExample implements RunnableExample {
    @Override
    public void run() {
        Date date = new Date(1456676267924L);
        DateFormat[] dateFormats = {
                DateFormat.getInstance(),
                DateFormat.getDateInstance(),
                DateFormat.getDateInstance(DateFormat.SHORT),
                DateFormat.getDateInstance(DateFormat.MEDIUM),
                DateFormat.getDateInstance(DateFormat.LONG),
                DateFormat.getDateInstance(DateFormat.FULL),
                DateFormat.getTimeInstance(),
                DateFormat.getTimeInstance(DateFormat.SHORT),
                DateFormat.getTimeInstance(DateFormat.MEDIUM),
                DateFormat.getTimeInstance(DateFormat.LONG),
                DateFormat.getTimeInstance(DateFormat.FULL)
        };
        for (DateFormat dateFormat : dateFormats) {
            LOGGER.info(dateFormat.format(date));
        }
    }
}
