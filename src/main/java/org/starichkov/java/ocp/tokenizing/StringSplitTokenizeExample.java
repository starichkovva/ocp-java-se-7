package org.starichkov.java.ocp.tokenizing;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov
 * @since 05.03.2016 22:47
 */
public class StringSplitTokenizeExample implements RunnableExample {
    @Override
    public void run() {
        String[][] tokensAndDelimiters = {
                {"There,are,a,comma,separated,values", ","},
                {"And1there2are3a4digits5separated6values", "\\d"}
        };

        for (String[] tokenAndDelimiter : tokensAndDelimiters) {
            String tokens = tokenAndDelimiter[0];
            String[] values = tokens.split(tokenAndDelimiter[1]);
            printArray(values);
        }
    }

    private void printArray(Object[] array) {
        LOGGER.info("Values:");
        for (Object value : array) {
            LOGGER.info(">{}", value);
        }
    }
}
