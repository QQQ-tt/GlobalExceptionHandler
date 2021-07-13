package com.example.exceptionh.util;

import java.util.HashMap;

/** @Author: QTX @Date: 2021/7/13 */
public class R extends HashMap<String, Object> {

  private static final long serialVersionUID = 6511938477845573866L;

  public R(String msg) {
    put("code", 110);
    put("msg", msg);
  }
}
