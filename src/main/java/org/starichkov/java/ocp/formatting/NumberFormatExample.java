package org.starichkov.java.ocp.formatting;

import org.starichkov.java.ocp.RunnableExample;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 21:56
 */
public class NumberFormatExample implements RunnableExample {
    @Override
    public void run() {
        double value = 123.4567;
        Locale locale = new Locale("en", "UK");
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(locale);
        numberFormats[2] = NumberFormat.getCurrencyInstance();
        numberFormats[3] = NumberFormat.getCurrencyInstance(locale);
        for (NumberFormat numberFormat : numberFormats) {
            LOGGER.info(numberFormat.format(value));
        }
    }
}
