package com.example.exceptionh.aspect;

import com.example.exceptionh.exception.MyException;
import com.example.exceptionh.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/** @Author: QTX @Date: 2021/7/13 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

  @ExceptionHandler(MyException.class)
  public R myError(MyException e) {
    e.printStackTrace();
    log.error("错误信息：" + e);
    return new R(e.getMessage());
  }
}
