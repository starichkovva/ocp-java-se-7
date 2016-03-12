package org.starichkov.java.ocp.formatting;

import org.starichkov.java.ocp.RunnableExample;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Vadim Starichkov
 * @since 08.03.2016 21:21
 */
public class PrintStreamFormatExample implements RunnableExample {
    @Override
    public void run() {
        int i1 = -123;
        int i2 = 12345;
        System.out.printf("| %1$(10d | \n", i1);
        System.out.format("| %+-10d | \n", i1);
        System.out.format("| %+-10d | \n", i2);
        System.out.printf("| %0,10d | \n", i2);
        System.out.printf("| %2$b + %1$5d | \n", i1, false);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.format("%1$te\\%1$tm\\%1$ty", calendar);
    }
}
