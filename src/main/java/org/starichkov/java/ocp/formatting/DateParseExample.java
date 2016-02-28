package org.starichkov.java.ocp.formatting;

import org.starichkov.java.ocp.RunnableExample;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 19:30
 */
public class DateParseExample implements RunnableExample {
    @Override
    public void run() {
        Date originalDate = new Date(1456676267924L);
        LOGGER.info("Original date: {}", originalDate);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);

        String formattedString = dateFormat.format(originalDate);
        LOGGER.info(formattedString);

        try {
            Date parsedDate = dateFormat.parse(formattedString);
            LOGGER.info("Parsed date: {}", parsedDate);
        } catch (ParseException e) {
            LOGGER.error("Parsing error!", e);
        }
    }
}
