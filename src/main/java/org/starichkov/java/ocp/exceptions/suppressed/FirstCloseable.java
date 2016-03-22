package org.starichkov.java.ocp.exceptions.suppressed;

/**
 * @author Vadim Starichkov (SimbirSoft)
 * @since 21.03.2016 14:18
 */
public class FirstCloseable extends SampleCloseable {
    public FirstCloseable() {
        LOGGER.info("FirstCloseable()");
    }

    @Override
    public void close() {
        LOGGER.info("FirstCloseable close()");
        super.close();
    }

    @Override
    protected RuntimeException createUncheckedException() {
        return new IllegalStateException("1");
    }
}
