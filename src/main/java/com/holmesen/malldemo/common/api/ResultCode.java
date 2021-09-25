package com.holmesen.malldemo.common.api;

/**
 * 常用API返回对象
 * @Author: Holmesen
 * @Date: 2021/9/25 11:37
 */
public enum ResultCode implements IErrorCode{
  /*操作成功*/
  SUCCESS(200, "操作成功"),
  /*操作失败*/
  FAILED(500, "操作失败"),
  /*参数校验失败*/
  VALIDATE_FAILED(404, "参数校验失败"),
  /*暂未登录或token已经过期*/
  UNAUTHORIZED(401, "暂未登录或token已经过期"),
  /*没有相关权限*/
  FORBIDDEN(403, "没有相关权限");

  private long code;
  private String message;

  ResultCode(long code, String message) {
    this.code = code;
    this.message = message;
  }

  @Override
  public long getCode() {
    return code;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
