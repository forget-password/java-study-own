package com.demo.demo.exception;

import com.demo.demo.pojo.dto.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
// 统一的异常处理
@RestControllerAdvice // 统一处理
public class GlobalExceptionHandlerAdvice {
    Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);
    @ExceptionHandler({Exception.class}) // 所有异常的统一处理
    public ResponseMessage handleException(Exception e, HttpServletRequest request) {
        // 记录日志
        log.error(e.getMessage(), e);
        return new ResponseMessage<>(500, "error", null);
    }
}
