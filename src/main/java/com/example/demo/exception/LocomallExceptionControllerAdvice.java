package com.example.demo.exception;

import com.example.demo.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.example.demo.enums.StatusCodeEnum.SYSTEM_ERROR;

@RestControllerAdvice(basePackages = "com.example.demo.controller")
@Slf4j
public class LocomallExceptionControllerAdvice {
        @ExceptionHandler(value = Throwable.class)
    public R handleExcpeption(Throwable e){
        log.error("错误：{}", e);
        return R.error(SYSTEM_ERROR.getCode(), SYSTEM_ERROR.getDesc());
    }
}
