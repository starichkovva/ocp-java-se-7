package org.starichkov.java.ocp.regex;

import java.util.Scanner;

/**
 * @author Vadim Starichkov
 * @since 08.03.2016 00:04
 */
public class ScannerRegExExample extends BaseRegExExample {
    @Override
    public void run() {
        try (Scanner s = new Scanner("Abc1Abc12ABC123ABC1234")) {
            String token;
            do {
                token = s.findInLine("\\d\\d+");
                if (token != null) {
                    System.out.println("found: " + token);
                }
            } while (token != null);
        }
    }
}
