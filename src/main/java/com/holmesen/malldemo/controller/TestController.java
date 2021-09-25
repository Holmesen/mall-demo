package com.holmesen.malldemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试Controller
 * @Author: Holmesen
 * @Date: 2021/9/21 0:19
 */
@Api(tags = "TestController", description = "测试Controller")
@Controller
@RequestMapping("/test")
@ResponseBody
public class TestController {
  @ApiOperation("获取响应")
  @GetMapping("/echo")
  public String getEcho(@RequestParam("word")String word) {
    return word;
  }
}
