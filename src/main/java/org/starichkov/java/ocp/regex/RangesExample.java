package org.starichkov.java.ocp.regex;

/**
 * @author Vadim Starichkov
 * @since 06.03.2016 22:49
 */
public class RangesExample extends BaseRegExExample {
    @Override
    public void run() {
        String value = "ABCDEF123abcdef777";
        test(value, "[a-z]");
        test(value, "[A-Z]");
        test(value, "[a-zA-Z]");
        test(value, "[0-9]");
    }
}
