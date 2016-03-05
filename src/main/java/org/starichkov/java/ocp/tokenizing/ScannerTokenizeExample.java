package org.starichkov.java.ocp.tokenizing;

import org.starichkov.java.ocp.RunnableExample;

import java.util.Scanner;

/**
 * @author Vadim Starichkov
 * @since 05.03.2016 23:15
 */
public class ScannerTokenizeExample implements RunnableExample {
    @Override
    public void run() {
        String tokens = "Let the Java be with you... Always...";
        try (Scanner scanner = new Scanner(tokens)) {
            while (scanner.hasNext()) {
                LOGGER.info(scanner.next());
            }
        }

        String moreTokens = "2 true 9876543210 4,0";
        try (Scanner scanner = new Scanner(moreTokens)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    LOGGER.info("int: {}", scanner.nextInt());
                } else if (scanner.hasNextBoolean()) {
                    LOGGER.info("boolean: {}", scanner.nextBoolean());
                } else if (scanner.hasNextLong()) {
                    LOGGER.info("long: {}", scanner.nextLong());
                } else if (scanner.hasNextDouble()) {
                    LOGGER.info("double: {}", scanner.nextDouble());
                } else {
                    scanner.next();
                }
            }
        }
    }
}
