package com.junple.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.junple.mybatis.config.SpringMybatisConfig;

@Configuration
@Import(value={SpringMybatisConfig.class})
public class RootConfig {

}
