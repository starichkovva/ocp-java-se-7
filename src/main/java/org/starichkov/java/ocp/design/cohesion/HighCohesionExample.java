package org.starichkov.java.ocp.design.cohesion;

import org.starichkov.java.ocp.RunnableExample;

/**
 * @author Vadim Starichkov
 * @since 03.04.2016 21:06
 */
public class HighCohesionExample implements RunnableExample {
    @Override
    public void run() {
        System.out.println("High cohesion is great thing!");

        GoodCreator goodCreator = new GoodCreator();
        Good good = goodCreator.createGood();

        GoodPrinter goodPrinter = new GoodPrinter();
        goodPrinter.printGood(good);

        GoodSaver goodSaver = new GoodSaver();
        goodSaver.saveGood(good);
    }

    class Good {
        @Override
        public String toString() {
            return "Good{ Just some good! }";
        }
    }

    class GoodCreator {
        Good createGood() {
            return new Good();
        }
    }

    class GoodPrinter {
        void printGood(Good good) {
            System.out.println(good);
        }
    }

    class GoodSaver {
        void saveGood(Good good) {
            System.out.println("Saving good '" + good + "' somewhere.");
        }
    }
}
