package com.homework.project.shared.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

@Component
public class MessageUtils {

    @Autowired
    private MessageSource messageSource;

    public String getMessage(String messageId, String... args) {
        return messageSource.getMessage(messageId,
                args, LocaleContextHolder.getLocale());
    }
}
