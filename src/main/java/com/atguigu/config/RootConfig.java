package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author hxld
 * @create 2022-08-10 22:49
 */
//spring配置文件不扫描controller
@ComponentScan(value = "com.atguigu",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})})
public class RootConfig {
}
