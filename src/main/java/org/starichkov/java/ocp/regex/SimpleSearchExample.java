package org.starichkov.java.ocp.regex;

/**
 * @author Vadim Starichkov
 * @since 06.03.2016 22:18
 */
public class SimpleSearchExample extends BaseRegExExample {

    @Override
    public void run() {
        test("ololololo", "olo");
    }
}
