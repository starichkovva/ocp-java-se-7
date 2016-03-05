package org.starichkov.java.ocp.tokenizing;

import org.starichkov.java.ocp.RunnableExample;

import java.util.StringTokenizer;

/**
 * @author Vadim Starichkov
 * @since 06.03.2016 00:21
 */
public class StringTokenizerExample implements RunnableExample {
    @Override
    public void run() {
        StringTokenizer st = new StringTokenizer("Let the Java be with you... Always...");
        while (st.hasMoreTokens()) {
            LOGGER.info(">{}", st.nextToken("."));
        }
    }
}
