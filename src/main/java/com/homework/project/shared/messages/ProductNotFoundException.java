package com.homework.project.shared.messages;

import com.homework.project.shared.exception.base.BaseException;
import com.homework.project.shared.exception.code.ExceptionCode;
import org.springframework.http.HttpStatus;

public class ProductNotFoundException extends BaseException {

    public ProductNotFoundException(String message){
        super(false, HttpStatus.NOT_FOUND,message, ExceptionCode.PRODUCT_NOT_FOUND);
    }
}
