package org.starichkov.java.ocp;

import org.starichkov.java.ocp.formatting.CalendarExample;
import org.starichkov.java.ocp.formatting.DateExample;
import org.starichkov.java.ocp.formatting.DateFormatExample;
import org.starichkov.java.ocp.formatting.DateParseExample;
import org.starichkov.java.ocp.formatting.NumberFormatExample;
import org.starichkov.java.ocp.formatting.NumberParseExample;
import org.starichkov.java.ocp.formatting.LocalesExample;
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
 * @since 28.02.2016 19:13
 */
public final class Main {
    public static void main(String[] args) {
        RunnableExample runnableExample = null;
        try {
            int choice = Integer.parseInt(args[0]);
            switch (Examples.findByCode(choice)) {
                case DATE_FORMAT:
                    runnableExample = new DateFormatExample();
                    break;
                case DATE_PARSE:
                    runnableExample = new DateParseExample();
                    break;
                case NUMBER_FORMAT:
                    runnableExample = new NumberFormatExample();
                    break;
                case NUMBER_PARSE:
                    runnableExample = new NumberParseExample();
                    break;
                case DATE:
                    runnableExample = new DateExample();
                    break;
                case CALENDAR:
                    runnableExample = new CalendarExample();
                    break;
                case LOCALES:
                    runnableExample = new LocalesExample();
                    break;
                case TOKENIZE_SCANNER:
                    runnableExample = new ScannerTokenizeExample();
                    break;
                case TOKENIZE_STRING_SPLIT:
                    runnableExample = new StringSplitTokenizeExample();
                    break;
                case TOKENIZE_STRING_TOKENIZER:
                    runnableExample = new StringTokenizerExample();
                    break;
                case REGEX_SIMPLE_SEARCH:
                    runnableExample = new SimpleSearchExample();
                    break;
                case REGEX_META_CHARACTER:
                    runnableExample = new MetaCharacterExample();
                    break;
                case REGEX_RANGES:
                    runnableExample = new RangesExample();
                    break;
                case REGEX_QUANTIFIERS:
                    runnableExample = new QuantifiersExample();
                    break;
                case REGEX_SCANNER:
                    runnableExample = new ScannerRegExExample();
                    break;
                case INVALID_EXAMPLE:
                default:
                    System.out.println("Unknown example requested.");
                    break;
            }
            if (runnableExample != null) {
                runnableExample.run();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private Main() {
    }
}
