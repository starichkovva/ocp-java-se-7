package org.starichkov.java.ocp.assertions;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov
 * @since 12.03.2016 22:58
 */
public class AssertionsExample implements RunnableExample {
    private enum Choices {
        FIRST, SECOND, THIRD
    }

    @Override
    public void run() {
        int x = 1;
        int y = 2;

        System.out.println("Assert's first form:");
        System.out.println("assert x < y;");
        assert x < y;

        System.out.println("Assert's second form:");
        System.out.println("assert x < y : \"Something strange happened...\";");
        assert x < y : "Something strange happened...";

        Choices choice = Choices.FIRST;
        switch (choice) {
            case FIRST:
                break;
            case SECOND:
                break;
            case THIRD:
                break;
            default:
                assert false;   // We should never get here.
        }
    }
}
