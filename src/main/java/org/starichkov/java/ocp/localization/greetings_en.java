package org.starichkov.java.ocp.localization;

import java.util.ListResourceBundle;

/**
 * @author Vadim Starichkov
 * @since 27.02.2016 00:23
 */
public class greetings_en extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"hi", "Hi!"}};
    }
}
