package org.starichkov.java.ocp.resourcebundles;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assume;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author Vadim Starichkov
 * @since 26.02.2016 22:07
 */
public class LocalizationTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocalizationTest.class);

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNormal() {
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.GERMAN);

        String[] languages = {"en", "ru", "fr"};

        for (String language : languages) {
            try {
                showSampleMessage(language, "hello");
            } catch (MissingResourceException e) {
                Assume.assumeNoException(e);
            }
        }

        Locale.setDefault(defaultLocale);
    }

    @Test
    public void testMissingResource() {
        thrown.expect(MissingResourceException.class);
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.CHINA);

        try {
            showSampleMessage("de", "hello");
        } finally {
            Locale.setDefault(defaultLocale);
        }
    }

    private void showSampleMessage(String language, String key) {
        Locale locale = new Locale(language);
        ResourceBundle bundle = ResourceBundle.getBundle("localization/hello", locale);
        LOGGER.info(bundle.getString(key));
    }
}
