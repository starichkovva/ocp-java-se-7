package org.starichkov.java.ocp;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 19:13
 */
public final class Main {
    public static void main(String[] args) {
        try {
            int choice = Integer.parseInt(args[0]);
            RunnableExample runnableExample = Examples.findByCode(choice);
            runnableExample.run();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private Main() {
    }
}
