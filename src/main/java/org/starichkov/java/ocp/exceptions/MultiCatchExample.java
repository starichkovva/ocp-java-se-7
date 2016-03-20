package org.starichkov.java.ocp.exceptions;

import org.starichkov.java.ocp.RunnableExample;

import java.util.Random;

/**
 * @author Vadim Starichkov
 * @since 20.03.2016 22:38
 */
public class MultiCatchExample implements RunnableExample {
    @Override
    public void run() {
        try {
            System.out.println("You can use multi-catch for exceptions from different hierarchies:");
            System.out.println("> catch (NullPointerException | IndexOutOfBoundsException | IllegalArgumentException e)");
            doSomethingNasty();
        } catch (NullPointerException | IndexOutOfBoundsException | IllegalArgumentException e) {
            System.err.println(e);
        } finally {
            System.out.println("But you cannot use multi-catch for exceptions in same hierarchy:");
            System.out.println("> catch (NullPointerException | IndexOutOfBoundsException | ArrayIndexOutOfBoundsException e)");
            System.out.println("This example won't compile because ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException.");
        }
    }

    private void doSomethingNasty() {
        Random rand = new Random();
        int min = 1;
        int max = 3;
        int somethingNasty = rand.nextInt(max - min + 1) + min;
        switch (somethingNasty) {
            case 1:
                throw new NullPointerException(String.valueOf(somethingNasty));
            case 2:
                throw new IndexOutOfBoundsException(String.valueOf(somethingNasty));
            case 3:
                throw new IllegalArgumentException(String.valueOf(somethingNasty));
        }
    }
}
