package com.holmesen.malldemo.service;

import com.holmesen.malldemo.common.api.CommonResult;

/**
 * 会员管理service
 * @Author: Holmesen
 * @Date: 2021/9/23 11:54
 */
public interface UmsMemberService {

  /**
   * 生成验证码
   * @param telephone 手机号
   * @return 公共结果
   */
  CommonResult generateAuthCode(String telephone);

  /**
   * 判断验证码和手机号码是否匹配
   * @param telephone 手机号
   * @param authCode 验证码
   * @return 公共结果
   */
  CommonResult verifyAuthCode(String telephone, String authCode);
}
