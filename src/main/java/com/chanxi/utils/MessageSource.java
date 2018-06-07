package com.chanxi.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.NoSuchMessageException;
import org.springframework.context.support.ResourceBundleMessageSource;

import javax.annotation.PostConstruct;
import java.util.Locale;

/**
 * Created by ymind on 2018/6/7.
 */
public class MessageSource  extends ResourceBundleMessageSource {
    private static Logger logger = LoggerFactory.getLogger(MessageSource.class);
    private static MessageSource instance;

    public MessageSource() {
    }

    public static String getMessage(String code, Object... args) {
        try {
            return instance.getMessage(code, args, (Locale)null);
        } catch (NoSuchMessageException var3) {
            return code;
        }
    }

    @PostConstruct
    public void init() {
        logger.info("MessageSource init");
        instance = this;
    }
}
