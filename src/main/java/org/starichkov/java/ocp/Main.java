package org.starichkov.java.ocp;

import org.starichkov.java.ocp.formatting.DateFormatExample;
import org.starichkov.java.ocp.formatting.DateParseExample;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 19:13
 */
public final class Main {
    public static void main(String[] args) {
        RunnableExample runnableExample = null;
        try {
            int choice = Integer.parseInt(args[0]);
            switch (Examples.findByCode(choice)) {
                case DATE_FORMAT:
                    runnableExample = new DateFormatExample();
                    break;
                case DATE_PARSE:
                    runnableExample = new DateParseExample();
                    break;
                case INVALID_EXAMPLE:
                default:
                    System.out.println("Unknown example requested.");
                    break;
            }
            if (runnableExample != null) {
                runnableExample.run();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private Main() {
    }
}
