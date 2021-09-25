package com.holmesen.malldemo.controller;

import com.holmesen.malldemo.common.api.CommonResult;
import com.holmesen.malldemo.service.UmsMemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 会员登录注册管理Controller
 * @Author: Holmesen
 * @Date: 2021/9/23 11:53
 */
@Controller
@Api(tags = "UmsMemberController", description = "会员登录注册管理")
@RequestMapping("/sso")
@ResponseBody
public class UmsMemberController {
  @Autowired
  private UmsMemberService umsMemberService;

  @ApiOperation("获取验证码")
  @GetMapping("/getAuthCode")
  public CommonResult getAuthCode(@RequestParam String telephone) {
    return umsMemberService.generateAuthCode(telephone);
  }

  @ApiOperation("判断验证码是否正确")
  @PostMapping("/verifyAuthCode")
  public CommonResult verifyAuthCode(@RequestParam String telephone, @RequestParam String authCode) {
    return umsMemberService.verifyAuthCode(telephone, authCode);
  }
}
