package com.example.demo.common.exception;

import com.example.demo.common.enums.StatusCodeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @descriptions:设置全局捕获异常固定返回值
 * @author: Liu XuChao
 * @date: 2023/11/9 10:40
 * @version: 1.0
 */
@ControllerAdvice
public class GlobaExceptionHandler {

    private static final Logger log = LoggerFactory.getLogger(GlobaExceptionHandler.class);

    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public Map<String, Object> handleException(Throwable exception) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", StatusCodeEnum.SYSTEM_ERROR);
        map.put("msg", exception.getMessage());
        map.put("timestamp", System.currentTimeMillis());
        log.error("Exception", exception);
        return map;
    }

}

