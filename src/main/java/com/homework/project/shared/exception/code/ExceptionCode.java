package com.homework.project.shared.exception.code;

import lombok.Getter;
@Getter
public enum ExceptionCode {
    PRODUCT_NOT_FOUND("ERR-001", "Exception.PRODUCT_NOT_FOUND_EXCEPTION"),
    PRODUCT_INACTIVE("ERR-002", "Exception.MOVIE_INACTIVE"),
    CATEGORY_NOT_FOUND("ERR-03", "Exception.CATEGORY_NOT_FOUND_EXCEPTION");

    private final String code;
    private final String type;

    ExceptionCode(String code, String type) {
        this.code = code;
        this.type = type;
    }
}
