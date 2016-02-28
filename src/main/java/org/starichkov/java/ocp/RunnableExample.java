package org.starichkov.java.ocp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 19:12
 */
public interface RunnableExample {
    Logger LOGGER = LoggerFactory.getLogger(RunnableExample.class);

    void run();
}
