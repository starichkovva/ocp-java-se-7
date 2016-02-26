package org.starichkov.java.ocp.resourcebundles;

import org.junit.Rule;
import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author Vadim Starichkov
 * @since 26.02.2016 22:07
 */
@RunWith(Theories.class)
public class LocalizationTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(LocalizationTest.class);

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @DataPoints
    public static final String[][] testResources = {
            {"hello", "hello"},
            {"greetings", "hi"},
    };

    @Theory
    public void test(String[] testData) {
        if (testData.length == 2) {
            testNormal(testData[0], testData[1]);
            testMissingResource(testData[0], testData[1]);
        }
    }

    /**
     * Tests situation when all resource files available.
     *
     * @param resource resource name
     * @param key      resource key
     */
    private void testNormal(String resource, String key) {
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.GERMAN);

        String[] languages = {"en", "ru", "fr"};

        for (String language : languages) {
            try {
                showSampleMessage(language, resource, key);
            } catch (MissingResourceException e) {
                Assume.assumeNoException(e);
            }
        }

        Locale.setDefault(defaultLocale);
    }

    /**
     * Tests situation when one of resource files (for german language) is missing.
     * <br/>
     * {@link MissingResourceException} exception expected.
     *
     * @param resource resource name
     * @param key      resource key
     */
    private void testMissingResource(String resource, String key) {
        thrown.expect(MissingResourceException.class);
        Locale defaultLocale = Locale.getDefault();
        Locale.setDefault(Locale.CHINA);

        try {
            showSampleMessage("de", resource, key);
        } finally {
            Locale.setDefault(defaultLocale);
        }
    }

    private static void showSampleMessage(String language, String resource, String key) {
        Locale locale = new Locale(language);
        ResourceBundle bundle = ResourceBundle.getBundle("localization/" + resource, locale);
        LOGGER.info(bundle.getString(key));
    }
}
