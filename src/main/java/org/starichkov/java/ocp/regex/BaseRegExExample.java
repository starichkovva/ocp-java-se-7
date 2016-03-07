package org.starichkov.java.ocp.regex;

import org.starichkov.java.ocp.RunnableExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Vadim Starichkov
 * @since 07.03.2016 00:11
 */
public abstract class BaseRegExExample implements RunnableExample {

    public void test(String value, String... patterns) {
        for (String pattern : patterns) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(value);
            LOGGER.info("===== RegEx: {}", m.pattern());
            LOGGER.info("index: 0123456789012345678901234567890123456789");
            LOGGER.info("value: {}", value);
            LOGGER.info("match positions: ");
            while (m.find()) {
                LOGGER.info("{} {}", m.start(), m.group());
            }
        }
    }
}
