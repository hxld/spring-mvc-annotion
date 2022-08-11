package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import java.util.List;

/**
 * @author hxld
 * @create 2022-08-10 22:49
 */
//springmvc子容器，只扫描controller
@ComponentScan(value = "com.atguigu",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})},useDefaultFilters = false)
//开启mvc定制功能
@EnableWebMvc
public class AppConfig extends  WebMvcConfigurerAdapter  {


//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
////        super.configureViewResolvers(registry);
//        registry.jsp("/")
//    }
}
