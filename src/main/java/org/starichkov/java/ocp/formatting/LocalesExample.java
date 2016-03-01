package org.starichkov.java.ocp.formatting;

import org.starichkov.java.ocp.RunnableExample;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 23:20
 */
public class LocalesExample implements RunnableExample {
    @Override
    public void run() {
        Locale locPT = new Locale("pt");        // Portugal
        Locale locIN = new Locale("hi", "IN");  // India
        Locale locJA = new Locale("ja");        // Japan
        Locale locBR = new Locale("pt", "BR");  // Brazil
        Locale locDK = new Locale("da", "DK");  // Denmark
        Locale locIT = new Locale("it", "IT");  // Italy

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, 01, 29);             // February 29, 2016, (month is 0-based)
        Date d2 = calendar.getTime();

        LOGGER.info("===== Part 1 =====");
        DateFormat dfUS = DateFormat.getInstance();
        LOGGER.info("US       {}", dfUS.format(d2));
        DateFormat dfUSfull = DateFormat.getDateInstance(DateFormat.FULL);
        LOGGER.info("US full  {}", dfUSfull.format(d2));
        DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
        LOGGER.info("Italy    {}", dfIT.format(d2));
        DateFormat dfPT = DateFormat.getDateInstance(DateFormat.FULL, locPT);
        LOGGER.info("Portugal {}", dfPT.format(d2));
        DateFormat dfBR = DateFormat.getDateInstance(DateFormat.FULL, locBR);
        LOGGER.info("Brazil   {}", dfBR.format(d2));
        DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, locIN);
        LOGGER.info("India    {}", dfIN.format(d2));
        DateFormat dfJA = DateFormat.getDateInstance(DateFormat.FULL, locJA);
        LOGGER.info("Japan    {}", dfJA.format(d2));


        LOGGER.info("===== Part 2 =====");
        LOGGER.info("default: {}", locBR.getDisplayCountry());
        LOGGER.info("locale: {}", locBR.getDisplayCountry(locBR));
        LOGGER.info("default: {}", locDK.getDisplayLanguage());
        LOGGER.info("locale: {}", locDK.getDisplayLanguage(locDK));
        LOGGER.info("Denmark > Italy: {}", locDK.getDisplayLanguage(locIT));

    }
}
