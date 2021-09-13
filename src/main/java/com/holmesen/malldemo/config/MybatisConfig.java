package com.holmesen.malldemo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置类
 * @Author: Holmesen
 * @Date: 2021/9/13 23:02
 */
@Configuration
@MapperScan("com.holmesen.malldemo.mbg.mapper")
public class MybatisConfig {
}
