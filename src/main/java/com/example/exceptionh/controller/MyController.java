package com.example.exceptionh.controller;

import com.example.exceptionh.exception.MyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** @Author: QTX @Date: 2021/7/13 */
@RestController
public class MyController {
  @GetMapping("/1")
  public String eTest() throws MyException {
    throw new MyException("QQQ");
  }
}
