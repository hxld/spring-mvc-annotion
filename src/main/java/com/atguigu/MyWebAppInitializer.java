package com.atguigu;

import com.atguigu.config.AppConfig;
import com.atguigu.config.RootConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author hxld
 * @create 2022-08-10 22:38
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    //获取根容器的配置类：（spring的配置文件）  父容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootConfig.class};
    }

    //获取web容器的配置类：springmvc的配置文件  子容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    //获取dispatcherservlet的信息
    // / 拦截所有请求，不包括.jsp文件
    // /* 拦截所有请求， 包括.jsp文件
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
