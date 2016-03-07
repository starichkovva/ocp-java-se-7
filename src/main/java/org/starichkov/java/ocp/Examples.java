package org.starichkov.java.ocp;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 19:30
 */
public enum Examples {
    INVALID_EXAMPLE(0),
    DATE_FORMAT(81),
    DATE_PARSE(82),
    NUMBER_FORMAT(83),
    NUMBER_PARSE(84),
    DATE(85),
    CALENDAR(86),
    LOCALES(87),
    TOKENIZE_SCANNER(881),
    TOKENIZE_STRING_SPLIT(882),
    TOKENIZE_STRING_TOKENIZER(883),
    REGEX_SIMPLE_SEARCH(891),
    REGEX_META_CHARACTER(892),
    REGEX_RANGES(893),
    REGEX_QUANTIFIERS(894),
    REGEX_SCANNER(895),
    ;

    private final int code;

    Examples(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Examples findByCode(int code) {
        for (Examples example : values()) {
            if (example.getCode() == code) {
                return example;
            }
        }
        return INVALID_EXAMPLE;
    }
}
