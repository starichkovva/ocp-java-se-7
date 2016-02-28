package org.starichkov.java.ocp;

/**
 * @author Vadim Starichkov
 * @since 28.02.2016 19:30
 */
public enum Examples {
    INVALID_EXAMPLE(0), DATE_FORMAT(81), DATE_PARSE(82);

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
