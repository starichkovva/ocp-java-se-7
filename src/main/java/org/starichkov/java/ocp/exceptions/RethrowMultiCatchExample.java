package org.starichkov.java.ocp.exceptions;

import org.starichkov.java.ocp.RunnableExample;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Vadim Starichkov
 * @since 27.03.2016 19:06
 */
public class RethrowMultiCatchExample implements RunnableExample {
    @Override
    public void run() {
        try {
            rethrow();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void couldThrowAnException() throws IOException, SQLException {
        // throw or not an a exception
        //throw new NoSuchFieldException();
    }

    private void rethrow() throws SQLException, IOException {
        try {
            couldThrowAnException();
        } catch (Exception e) {     // this isn't really catching all exception subclasses
            // Handle and declare
            throw e;                // note: won't compile in Java 6
        }
    }
}
