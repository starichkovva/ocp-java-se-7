package org.starichkov.java.ocp.regex;

/**
 * @author Vadim Starichkov
 * @since 06.03.2016 22:26
 */
public class MetaCharacterExample extends BaseRegExExample {
    @Override
    public void run() {
        test("a1b2c3d4e5f6", "\\d", "\\D");
        test("Let the Java be with you!", "\\s", "\\S");
        test("Word, and this_8is7_word too!", "\\w", "\\W");
        test("Boundaries regular expression", "\\b");
        test("abc def", "\\B");
        test("a c abc a4c ac", "a.c");
    }
}
