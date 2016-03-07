package org.starichkov.java.ocp.regex;

/**
 * @author Vadim Starichkov
 * @since 06.03.2016 22:50
 */
public class QuantifiersExample extends BaseRegExExample {
    @Override
    public void run() {
        test("0 0x 0XG 0xA 0X12ABCD", "0[xX]([0-9a-fA-F])+");
        test("yyxxxyxx", ".*?xx");
        test("yyxxxyxx", ".*xx");
    }
}
