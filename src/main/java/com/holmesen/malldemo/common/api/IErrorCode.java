package com.holmesen.malldemo.common.api;

/**
 * 常用API返回对象接口
 * @Author: Holmesen
 * @Date: 2021/9/25 11:37
 */
public interface IErrorCode {

  /**
   * 返回码
   * @return 返回码
   */
  long getCode();

  /**
   * 返回信息
   * @return 返回信息
   */
  String getMessage();
}
