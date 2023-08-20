package com.homework.project.shared.messages.category;

import com.homework.project.shared.exception.base.BaseException;
import com.homework.project.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CategoryNotFoundException extends BaseException {

    public CategoryNotFoundException(String message){
        super(false, HttpStatus.NOT_FOUND,message, ExceptionCode.PRODUCT_NOT_FOUND);
    }
}
