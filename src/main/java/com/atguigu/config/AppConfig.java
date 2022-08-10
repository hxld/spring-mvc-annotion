package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author hxld
 * @create 2022-08-10 22:49
 */
//springmvc子容器，只扫描controller
@ComponentScan(value = "com.atguigu",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})},useDefaultFilters = false)
public class AppConfig {

}
