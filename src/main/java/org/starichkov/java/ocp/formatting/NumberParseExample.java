package org.starichkov.java.ocp.formatting;

import org.starichkov.java.ocp.RunnableExample;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 22:04
 */
public class NumberParseExample implements RunnableExample {
    @Override
    public void run() {
        double value = 123.45678;
        NumberFormat numberFormat = NumberFormat.getInstance(new Locale("ru", "RU"));
        LOGGER.info("Maximum fraction digits: {}", numberFormat.getMaximumFractionDigits());
        LOGGER.info(numberFormat.format(value));

        numberFormat.setMaximumFractionDigits(5);
        LOGGER.info("Maximum fraction digits: {}", numberFormat.getMaximumFractionDigits());
        LOGGER.info(numberFormat.format(value));

        try {
            Number number = numberFormat.parse("1234,567");
            LOGGER.info("{}", number);

            numberFormat.setParseIntegerOnly(true);
            number = numberFormat.parse("1234,567");
            LOGGER.info("{}", number);

        } catch (ParseException e) {
            LOGGER.error("Parsing error!", e);
        }
    }
}
