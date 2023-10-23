package com.example.Spring.config;

import com.example.Spring.aspect.AspectLogger;
import com.example.Spring.aspect.LoggingAspect;
import com.example.Spring.service.MensajeService;
import com.example.Spring.service.MensajeServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example.Spring")
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public MensajeService mensajeService() {
        return new MensajeServiceImpl();
    }
    @Bean
    public AspectLogger aspectLogger() {
        return new AspectLogger();
    }
}
