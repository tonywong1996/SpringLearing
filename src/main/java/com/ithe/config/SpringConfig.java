package com.ithe.config;


import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.ithe")
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
@Import({JdbcConfig.class, MybatisConfig.class, MyAdvice.class})
@EnableTransactionManagement
public class SpringConfig {
}
