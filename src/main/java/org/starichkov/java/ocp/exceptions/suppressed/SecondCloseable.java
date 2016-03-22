package org.starichkov.java.ocp.exceptions.suppressed;

/**
 * @author Vadim Starichkov (SimbirSoft)
 * @since 21.03.2016 14:18
 */
public class SecondCloseable extends SampleCloseable {
    public SecondCloseable() {
        LOGGER.info("SecondCloseable()");
    }

    @Override
    public void close() {
        LOGGER.info("SecondCloseable close()");
        super.close();
    }

    @Override
    protected RuntimeException createUncheckedException() {
        return new IllegalStateException("2");
    }
}
