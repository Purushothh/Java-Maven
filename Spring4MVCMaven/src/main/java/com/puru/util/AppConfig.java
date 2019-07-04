package com.puru.util;

import com.puru.controller.HomeController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by PurushothA on 7/4/2019.
 */

    @Configuration
    @EnableWebMvc
    public class AppConfig extends WebMvcConfigurerAdapter{
        @Bean
        public InternalResourceViewResolver viewResolver(){
            InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
            internalResourceViewResolver.setPrefix("/");
            internalResourceViewResolver.setSuffix(".jsp");
            return internalResourceViewResolver;

        }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
       configurer.enable();
    }
}

