package org.starichkov.java.ocp.localization;

import java.util.ListResourceBundle;

/**
 * @author Vadim Starichkov
 * @since 27.02.2016 00:25
 */
public class greetings_fr extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"hi", "Salut!"}};
    }
}
