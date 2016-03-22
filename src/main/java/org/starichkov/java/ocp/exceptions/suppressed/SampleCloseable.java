package org.starichkov.java.ocp.exceptions.suppressed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Vadim Starichkov (SimbirSoft)
 * @since 21.03.2016 14:17
 */
public abstract class SampleCloseable implements AutoCloseable {
    protected static final Logger LOGGER = LoggerFactory.getLogger(SampleCloseable.class);

    @Override
    public void close() {
        throw createUncheckedException();
    }

    protected abstract RuntimeException createUncheckedException();
}
