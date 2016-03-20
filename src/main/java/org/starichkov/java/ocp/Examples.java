package org.starichkov.java.ocp;

import org.starichkov.java.ocp.assertions.AssertionsExample;
import org.starichkov.java.ocp.exceptions.MultiCatchExample;
import org.starichkov.java.ocp.exceptions.RethrowExample;
import org.starichkov.java.ocp.formatting.CalendarExample;
import org.starichkov.java.ocp.formatting.DateExample;
import org.starichkov.java.ocp.formatting.DateFormatExample;
import org.starichkov.java.ocp.formatting.DateParseExample;
import org.starichkov.java.ocp.formatting.NumberFormatExample;
import org.starichkov.java.ocp.formatting.NumberParseExample;
import org.starichkov.java.ocp.formatting.LocalesExample;
import org.starichkov.java.ocp.formatting.PrintStreamFormatExample;
import org.starichkov.java.ocp.regex.MetaCharacterExample;
import org.starichkov.java.ocp.regex.QuantifiersExample;
import org.starichkov.java.ocp.regex.RangesExample;
import org.starichkov.java.ocp.regex.ScannerRegExExample;
import org.starichkov.java.ocp.regex.SimpleSearchExample;
import org.starichkov.java.ocp.tokenizing.ScannerTokenizeExample;
import org.starichkov.java.ocp.tokenizing.StringSplitTokenizeExample;
import org.starichkov.java.ocp.tokenizing.StringTokenizerExample;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 19:30
 */
public enum Examples {
    ASSERTIONS(701, new AssertionsExample()),
    EXCEPTION_RETHROW(711, new RethrowExample()),
    MULTI_CATCH(712, new MultiCatchExample()),
    DATE_FORMAT(811, new DateFormatExample()),
    DATE_PARSE(812, new DateParseExample()),
    NUMBER_FORMAT(821, new NumberFormatExample()),
    NUMBER_PARSE(822, new NumberParseExample()),
    PRINT_STREAM_FORMAT(83, new PrintStreamFormatExample()),
    DATE(85, new DateExample()),
    CALENDAR(86, new CalendarExample()),
    LOCALES(87, new LocalesExample()),
    TOKENIZE_SCANNER(881, new ScannerTokenizeExample()),
    TOKENIZE_STRING_SPLIT(882, new StringSplitTokenizeExample()),
    TOKENIZE_STRING_TOKENIZER(883, new StringTokenizerExample()),
    REGEX_SIMPLE_SEARCH(891, new SimpleSearchExample()),
    REGEX_META_CHARACTER(892, new MetaCharacterExample()),
    REGEX_RANGES(893, new RangesExample()),
    REGEX_QUANTIFIERS(894, new QuantifiersExample()),
    REGEX_SCANNER(895, new ScannerRegExExample()),
    UNKNOWN(0, new RunnableExample() {
        @Override
        public void run() {
            System.out.println("Unknown example requested.");
        }
    });

    private final int code;
    private final RunnableExample example;

    Examples(int code, RunnableExample example) {
        this.code = code;
        this.example = example;
    }

    public int getCode() {
        return code;
    }

    public RunnableExample getExample() {
        return example;
    }

    public static RunnableExample findByCode(int code) {
        for (Examples example : values()) {
            if (example.getCode() == code) {
                return example.getExample();
            }
        }
        return UNKNOWN.getExample();
    }
}
