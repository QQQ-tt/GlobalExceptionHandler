package com.example.exceptionh.exception;

/** @Author: QTX @Date: 2021/7/13 */
public class MyException extends Exception {

	private static final long serialVersionUID = 7529699485711792093L;
	/** 错误码 */
  private int code;

  public MyException(String message) {
    super(message);
    this.code = 110;
  }

  public int getCode() {
    return code;
  }
}
